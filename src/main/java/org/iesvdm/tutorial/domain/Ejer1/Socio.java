package org.iesvdm.tutorial.domain.Ejer1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
public class Socio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(unique = true) //El dni será único
    private String dni;

    @Column(length = 30)
    private String nombre;

    @Column(length = 120)
    private String apellido;

    @OneToOne(mappedBy = "socio")
    private Tarjeta tarjeta;


}
