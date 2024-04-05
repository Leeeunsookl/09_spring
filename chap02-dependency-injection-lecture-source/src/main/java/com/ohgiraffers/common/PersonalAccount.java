package com.ohgiraffers.common;

import lombok.ToString;

@ToString
public class PersonalAccount implements Account{
    //Account 인터페이스 상속

    private final int bankCode;     //은행코드
    private final String accNo;     //계좌번호
    private int balance;    //잔액은 계속 변동되게 할거라 final x

    public PersonalAccount(int bankCode,String accNo){
        this.bankCode=bankCode;
        this.accNo=accNo;   //생성자 내부 초기화
    }

    @Override
    public String getBalance() {
        return this.accNo + "\n" +
                "The current balance of the account is " + this.balance + "Won.";
    }

    @Override
    public String deposit(int money) {

        String str = "";

        if(money >= 0){
            this.balance += money;
            str = money + "Won has been deposited.";
        } else {
            str = " The amount was entered incorrectly. ";
        }

        return str;
    }

    @Override
    public String withDraw(int money) {

        String str ="";

        if(this.balance >= money){
            this.balance -= money;
            str = money + "Won has been withdrawn.";
        }else{
            str = "Insufficient balance.";
        }

        return str;
    }
}
