package com.rami.gerassi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootConfiguration
@ComponentScan("com.rami.gerassi.gym")
@ComponentScan("com.rami.gerassi.controllers")
public class CodeGym {
    public static void main(String[] args) {
        SpringApplication.run(CodeGym.class, args);
    }
}
