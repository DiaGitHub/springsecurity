package fr.dyl.springsecurity.mapper;

import fr.dyl.springsecurity.dto.IngredientDto;
import fr.dyl.springsecurity.model.IngredientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IngredientMapper {

    IngredientMapper INGREDIENT_MAPPER = Mappers.getMapper(IngredientMapper.class);

    IngredientEntity toIngredient(IngredientDto ingredientDto);

    IngredientDto toIngredientDto(IngredientEntity ingredientEntity);
}
