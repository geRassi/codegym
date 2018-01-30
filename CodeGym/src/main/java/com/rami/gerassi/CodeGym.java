package com.rami.gerassi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Configuration
@Import(CodeGymConfig.class)
public class CodeGym {
    public static void main(String[] args) {
        SpringApplication.run(CodeGym.class, args);
    }
}
