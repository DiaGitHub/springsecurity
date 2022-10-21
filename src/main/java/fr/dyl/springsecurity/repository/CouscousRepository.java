package fr.dyl.springsecurity.repository;

import fr.dyl.springsecurity.model.CouscousEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouscousRepository extends JpaRepository<CouscousEntity, UUID> {
}
