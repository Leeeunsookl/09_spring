package com.ohgiraffers.common;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository("dao")
public class MemberDAO {

    private final Map<Integer,MemberDTO> memberMap;

    public MemberDAO(){
        this.memberMap= new HashMap<>();

        this.memberMap.put(1,new MemberDTO(1,"user01","pass01","aaa"));
        this.memberMap.put(2,new MemberDTO(1,"user02","pass02","def"));
    }

    public MemberDTO findSeq(int sequence){
        return memberMap.get(sequence);
    }

    public boolean make(MemberDTO member){
        int before=memberMap.size();
        memberMap.put(member.getSequence(),member);
        int after=memberMap.size();

        return after>before? true:false;
    }
}
