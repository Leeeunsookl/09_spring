package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        /* 3필기
        *   IoC(제어의 역전) 컨테이너
        *   BeanFactory 란 스프링에서 관리하는 모든 객체를 Bean 이라고 한다.
        *   스프링 컨테이너의 최상위 컨테이너이며 ApplicationnContext와 함께
        *   스프링 컨테이너라고 한다.
        *   Bean의 생성과 설정, 관리, 조립 등의 역할을 맡고 있다.
        *  */

        ApplicationContext context =
                new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");
        //1. bean 의 id를 이용해서 bean 을 가져오는 방법
//        MemberDTO member = (MemberDTO) context.getBean("member");

        //2. bean의 클래스 메타 정보를 전달하여 가져오는 방법
//       MemberDTO member = context.getBean(MemberDTO.class);
        //System.out.println("member = " + member);
        //3. bean의 id와 클래스 메타 정보를 전달하여 가져오는 방법
        MemberDTO member=context.getBean("member",MemberDTO.class);
        System.out.println("member = " + member);
    }
}
