package fr.dyl.springsecurity.repository;

import fr.dyl.springsecurity.model.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IngredientRepository extends JpaRepository<IngredientEntity, UUID> {
}
