package com.rami.gerassi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("lala")
    String x() {
        System.out.println("Hello");
        return "Hello";
    }
}
