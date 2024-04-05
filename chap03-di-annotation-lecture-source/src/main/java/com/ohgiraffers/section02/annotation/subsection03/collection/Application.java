package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.annotation.subsection02.qualifier.AnimalService;
import com.ohgiraffers.section02.common.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;


public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean : beanNames) {
            System.out.println(bean);
        }

        AnimalService animalService =context.getBean("animalCollection",AnimalService.class);
        animalService.animalEat();
    }}
