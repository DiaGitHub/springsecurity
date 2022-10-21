package fr.dyl.springsecurity.mapper;

import fr.dyl.springsecurity.dto.CouscousDto;
import fr.dyl.springsecurity.model.CouscousEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CouscousMapper {

    CouscousMapper COUSCOUS_MAPPER = Mappers.getMapper(CouscousMapper.class);

    CouscousEntity toCouscous(CouscousDto couscousDto);

    CouscousDto toCouscousDto(CouscousEntity couscousEntity);
}
