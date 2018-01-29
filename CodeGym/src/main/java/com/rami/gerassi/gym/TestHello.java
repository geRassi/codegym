package com.rami.gerassi.gym;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class TestHello {
    public TestHello() {
        System.out.printf("AAAAAA");
    }

    @PostConstruct
    void a(){System.out.printf("BBBBB");}
}
