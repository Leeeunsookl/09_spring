package com.ohgiraffers.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Raccoon implements Animal{
    @Override
    public void eat() {
        System.out.println("Racoon is eating the porkcurtlet ");
    }
}
