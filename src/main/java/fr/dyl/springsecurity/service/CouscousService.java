package fr.dyl.springsecurity.service;

import fr.dyl.springsecurity.dto.CouscousDto;
import fr.dyl.springsecurity.mapper.CouscousMapper;
import fr.dyl.springsecurity.repository.CouscousRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

import static fr.dyl.springsecurity.mapper.CouscousMapper.COUSCOUS_MAPPER;

@Service
@RequiredArgsConstructor
public class CouscousService {

    private final CouscousRepository couscousRepository;

    public CouscousDto getCouscous(UUID couscousId) {
        var couscousEntity = couscousRepository.findById(couscousId)
                                               .orElse(null);
        return COUSCOUS_MAPPER.toCouscousDto(couscousEntity);
    }

    @Transactional
    public UUID addCouscous(CouscousDto couscousDto) {
        var couscousEntity = COUSCOUS_MAPPER.toCouscous(couscousDto);
        couscousEntity.getIngredients()
                .forEach(ingredientEntity -> ingredientEntity.setCouscous(couscousEntity));
        return couscousRepository.save(couscousEntity).getId();
    }
}
