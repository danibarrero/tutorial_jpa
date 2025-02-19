package org.iesvdm.tutorial;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.iesvdm.tutorial.domain.Heroes.Heroe;
import org.iesvdm.tutorial.domain.Heroes.Mision;
import org.iesvdm.tutorial.domain.Heroes.Poder;
import org.iesvdm.tutorial.repository.HeroeRepository;
import org.iesvdm.tutorial.repository.MisionRepository;
import org.iesvdm.tutorial.repository.PoderRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class )
@SpringBootTest
public class HeroePoderMisionTests {

    @Autowired
    PoderRepository poderRepository;

    @Autowired
    HeroeRepository heroeRepository;

    @Autowired
    MisionRepository misionRepository;

    @PersistenceContext
    EntityManager entityManager;
    @Autowired
    private PlatformTransactionManager transactionManager;
    private TransactionTemplate transactionTemplate;
    @BeforeEach
    public void setUp() {
        transactionTemplate = new TransactionTemplate(transactionManager);
    }

    @Order(1)
    @Test
    void crearHeroeMisionPoderTest() {

        Mision mision = Mision.builder()
                .descripcion("Marvel")
                .villano("Venom")
                .build();

        Heroe heroe = Heroe.builder()
                .nombre("Spiderman")
                .build();
        this.heroeRepository.save(heroe);

        Poder poder = Poder.builder()
                .nombre("Invisibilidad")
                .build();
        this.poderRepository.save(poder);

        heroe.setMision(mision);
        mision.getHeroes().add(heroe);
        mision = this.misionRepository.save(mision);
        this.heroeRepository.save(heroe);


    }

}
