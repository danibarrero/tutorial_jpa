package org.iesvdm.tutorial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TutorialApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //PUEDO CREAR AQUÍ INICIALIZACIONES.. DEL PROYECTO
    }
}
