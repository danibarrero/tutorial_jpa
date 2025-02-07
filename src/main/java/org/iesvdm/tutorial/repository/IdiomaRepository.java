package org.iesvdm.tutorial.repository;

import org.iesvdm.tutorial.domain.Ejer2.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepository extends JpaRepository<Idioma, Long> {
}
