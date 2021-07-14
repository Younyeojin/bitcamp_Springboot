package com.example.demo.bank.domain;

import com.sun.istack.internal.Pool;
import lombok.Data;

@Data
public class BankAccountDTO {
    private String name;
    private String accountNumber;
    private int money;
    private String date;
    private float interest;
    private int balance;
    private boolean newAccount;
    public static final String BANK_NAME = "비트은행";
    @Override
    public String toString() {
        return BANK_NAME+
                "예금주='" +name+'\''+
                ", 계좌번호='"+accountNumber+'\''+
                ", 잔고="+balance+
                ", 거래일자='" + date + '\''+
                ", 이자율="+interest+"\n";
    }
}