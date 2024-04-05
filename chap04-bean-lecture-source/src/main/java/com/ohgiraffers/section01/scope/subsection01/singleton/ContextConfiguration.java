package com.ohgiraffers.section01.scope.subsection01.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class ContextConfiguration {

    //singleton 클래스의 인스턴스가 오직 하나만 생성되도록 보장하는 구조
    // 이 패턴은 전역 변수를 사용하지 않고 객체를 하나만 생성하여 어디서든 이 객체에 접근할 수 있도록 할 때 유용

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵",1000,new Date());
    }

    @Bean Product milk(){
        return new Beverage("초코우유",2000,500);
    }

    @Bean Product water(){
        return new Beverage("삼다수",50000,500);
    }

    /* 기본적인 스코프는 싱글톤
    *   하나의 인스턴스만 생성하고 모든 빈이 해당 인스턴스를 공유
    * */
    @Bean
//    @Scope("singleton")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }

}
