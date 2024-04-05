package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Bean
    public Account account(){
        return new PersonalAccount(10,"123-12345-123123123");
    }

    @Bean
    public MemberDTO member(){
        /* 생성자를 통한 주입 */
//        return new MemberDTO(1, "eunsook", "01076609949", "dmstnr738@naver.com", account());

        /* setter 주입 */
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("eunsooklee");
        member.setPhone("010");
        member.setEmail("dmstnr738@naver.com");
        member.setPersonalAccount(account());

        return member;
    }

}
