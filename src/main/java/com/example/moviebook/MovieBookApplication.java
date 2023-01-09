package com.example.moviebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MovieBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieBookApplication.class, args);
    }

}
