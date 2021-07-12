package com.example.demo.bank.domain;

import com.sun.istack.internal.Pool;
import lombok.Data;

@Data
public class BankAccountDTO {
    private String name;
    private String accountNumber;
    private int money;
    public static final String BANK_NAME = "비트은행";
    private String date;
    private float interest;
    private int balance;

}