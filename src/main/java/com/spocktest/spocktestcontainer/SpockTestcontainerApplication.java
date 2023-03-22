package com.spocktest.spocktestcontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpockTestcontainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpockTestcontainerApplication.class, args);
    }

}
