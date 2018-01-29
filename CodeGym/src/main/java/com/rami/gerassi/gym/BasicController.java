package com.rami.gerassi.gym;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping
    String x() {
        System.out.println("Hello");
        return "Hello";
    }
}
