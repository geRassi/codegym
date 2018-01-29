package com.rami.gerassi;

import com.rami.gerassi.gym.GymConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan("com.rami.gerassi.gym")
public class CodeGym {
    public static void main(String[] args) {
        SpringApplication.run(CodeGym.class, args);
    }
}
