package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        //ApplicationContext는 스프링 IoC(Inversion of Control, 제어의 역전) 컨테이너의 고급 버전
        // 이 컨테이너는 빈(bean)의 정의, 의존성 주입(Dependency Injection), 리소스 관리 등을 포함하여
        // 애플리케이션의 전반적인 구성과 생명주기를 관리
        ApplicationContext context =
                new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        //1. MemberDTO member = (MemberDTO)context.getBean("member");
        //2. MemberDTO member = context.getBean("MemberDTO.class");
        //   System.out.println("member = " + member);
        MemberDTO member = context.getBean("member",MemberDTO.class);
        System.out.println("member = " + member);
    /*
    이 코드 라인에서 괄호를 사용하는 이유는 Java에서의 타입 캐스팅(type casting) 때문입니다.
    context.getBean("member") 메서드는 Object 타입을 반환합니다.
    그러나 대부분의 경우, 우리는 Object 타입 대신에 더 구체적인 타입의 객체를 사용하길 원합니다.
    이 경우, MemberDTO 타입의 객체를 원합니다.
    Java에서는 반환된 객체를 원하는 타입으로 사용하기 위해서 명시적 타입 캐스팅이 필요합니다.
    이 과정에서 (MemberDTO)는 context.getBean("member")에 의해 반환된 Object 객체를
    MemberDTO 타입으로 캐스팅하라는 지시입니다.
    즉, 이는 "이 객체는 MemberDTO 타입이니, MemberDTO로서 다루겠다"라는 뜻입니다.

    타입 캐스팅은 필요한 경우에만 사용해야 합니다.
    잘못된 타입으로 캐스팅을 시도하면, ClassCastException이 발생할 수 있습니다.
    이러한 이유로, 가능한 경우 스프링의 getBean(Class<T> requiredType) 메서드를 사용하여
    타입 캐스팅 없이 직접적으로 원하는 타입의 객체를 반환받는 것이 더 안전합니다.
    예를 들어, MemberDTO member = context.getBean("member", MemberDTO.class);
    와 같이 사용할 수 있습니다.
    이 방법을 사용하면, 컴파일 타임에 타입 안정성을 보장받을 수 있습니다. */

    }
}
