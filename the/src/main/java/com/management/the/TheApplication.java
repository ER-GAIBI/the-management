package com.management.the;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheApplication {

    public static void main(String[] args) {
        System.out.println("test");
        SpringApplication.run(TheApplication.class, args);
    }

}
