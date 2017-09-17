package com.ctinute.spring.simplerestapi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ctinute.spring.simplerestapi")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
