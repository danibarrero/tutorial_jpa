package org.iesvdm.tutorial.domain;

import jakarta.persistence.*;
import lombok.*;
import org.iesvdm.tutorial.domain.Ejer2.PeliculaCategoria;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(length = 30, nullable = false)
    private String nombre;

    // @ManyToMany(mappedBy = "categorias")
    // private Set<Pelicula> peliculas;

    @OneToMany(mappedBy = "categoria")
    private Set<PeliculaCategoria> peliculaCategoria;

}
