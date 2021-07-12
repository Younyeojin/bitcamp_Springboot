package com.example.demo.bank.domain;

import com.sun.istack.internal.Pool;

public class BankAccountDTO {
    private String name;
    private String accountNumber;
    private int money;
    private String bankName;
    private String date;
    private float interest;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public int getMoney(){
        return this.money;
    }
    public void setBankName(String name){
        this.name = name;
    }
    public String getBankName(){
        return this.name;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }
    public void setInterest(float interest){
        this.interest = interest;
    }
    public float getInterest(){
        return this.interest;
    }
}