package fr.dyl.springsecurity.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "couscous")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CouscousEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    private String name;

    @OneToMany(mappedBy = "couscous", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<IngredientEntity> ingredients;
}