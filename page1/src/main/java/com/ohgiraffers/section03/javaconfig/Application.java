package com.ohgiraffers.section03.javaconfig;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context=
                new AnnotationConfigApplicationContext(ContextConfiguration.class);


        String[] beanNames = context.getBeanDefinitionNames();      //프링 프레임워크의 ApplicationContext 인터페이스에 정의된 메소드 중 하나입니다. 이 메소드는 애플리케이션 컨텍스트가 관리하는 모든 빈의 이름을 문자열 배열로 반환합니다.
        for(String beanName : beanNames){
            System.out.println("beanName = " + beanName);
        }

        MemberDAO memberDAO = context.getBean("dao", MemberDAO.class);
        System.out.println(memberDAO.findSeq(1));
        System.out.println(memberDAO.make(new MemberDTO(3,"user333","passssss","sdfkjsalkfj")));
        System.out.println(memberDAO.findSeq(3));
    }
}
