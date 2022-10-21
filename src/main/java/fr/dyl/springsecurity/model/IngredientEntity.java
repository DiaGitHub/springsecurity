package fr.dyl.springsecurity.model;

import javax.persistence.*;

import lombok.*;

import java.util.UUID;

import static javax.persistence.EnumType.STRING;

@Entity
@Table(name = "ingredient")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IngredientEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    private UUID id;

    private String name;

    @Enumerated(STRING)
    private Type type;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "couscous_id", nullable = false)
    private CouscousEntity couscous;
}
