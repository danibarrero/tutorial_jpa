package org.iesvdm.tutorial.repository;

import org.iesvdm.tutorial.domain.Ejer2.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
