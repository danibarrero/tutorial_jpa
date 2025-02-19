package org.iesvdm.tutorial.domain.Heroes;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
public class Mision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(length = 254)
    private String descripcion;

    @Column(length = 45)
    private String villano;

    @OneToMany(mappedBy = "mision", fetch = FetchType.EAGER)
    @Builder.Default
    private Set<Heroe> heroes = new HashSet<>();

}
