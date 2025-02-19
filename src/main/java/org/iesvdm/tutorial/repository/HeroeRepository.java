package org.iesvdm.tutorial.repository;
import org.iesvdm.tutorial.domain.Ejer2.Actor;
import org.iesvdm.tutorial.domain.Heroes.Heroe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroeRepository extends JpaRepository<Heroe, Long> {
}
