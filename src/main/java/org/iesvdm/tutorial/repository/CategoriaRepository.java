package org.iesvdm.tutorial.repository;

import org.iesvdm.tutorial.domain.Ejer2.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
