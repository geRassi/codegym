package com.rami.gerassi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.rami.gerassi.gym")
@ComponentScan("com.rami.gerassi.controllers")
public class CodeGymConfig {
}
