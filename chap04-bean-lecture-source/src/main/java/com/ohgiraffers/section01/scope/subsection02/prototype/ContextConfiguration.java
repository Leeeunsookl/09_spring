package com.ohgiraffers.section01.scope.subsection02.prototype;

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

    @Bean
    @Scope("prototype")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }
    //cart1 갖고 있는 상품들[Product{name='붕어빵', Price=1000} Fri Apr 05 15:53:53 KST 2024, Product{name='초코우유', Price=2000} 500]
    //cart2 = [Product{name='삼다수', Price=50000} 500]
    //prototype: getBean()시에 매번 새로운 인스턴스를 생성하게 해줌.
}
