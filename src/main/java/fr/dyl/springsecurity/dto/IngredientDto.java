package fr.dyl.springsecurity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.dyl.springsecurity.model.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;

import java.util.UUID;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;
import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IngredientDto {
    @Nullable
    @JsonProperty(access = READ_ONLY)
    private UUID id;
    private String name;
    private Type type;
}
