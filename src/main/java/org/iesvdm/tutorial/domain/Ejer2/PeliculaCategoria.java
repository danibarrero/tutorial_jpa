package org.iesvdm.tutorial.domain.Ejer2;

import jakarta.persistence.*;
import lombok.*;
import org.iesvdm.tutorial.domain.Categoria;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
public class PeliculaCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Pelicula pelicula;

}
