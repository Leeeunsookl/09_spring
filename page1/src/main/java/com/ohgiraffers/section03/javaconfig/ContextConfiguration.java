package com.ohgiraffers.section03.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration      //해당 클래스가 스프링의 설정 정보를 담고 있는 클래스임을 나타냄
@ComponentScan(basePackages = "com.ohgiraffers")
public class ContextConfiguration {

}
