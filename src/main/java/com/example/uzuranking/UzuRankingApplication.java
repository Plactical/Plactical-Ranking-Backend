package com.example.uzuranking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UzuRankingApplication {

    public static void main(String[] args) {
        SpringApplication.run(UzuRankingApplication.class, args);
    }

}
