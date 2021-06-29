package com.example.mydevboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyDevBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDevBoardApplication.class, args);
    }

}
