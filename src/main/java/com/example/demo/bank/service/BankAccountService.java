package com.example.demo.bank.service;
/*
은행이름은 상수로 정한다
이름, 금액, 계좌번호를 입력한 후 입금한 후 잔액을 확인한다
이름, 금액, 계좌번호를 입력한 후 출금한 후 잔액을 확인한다
이름, 금액, 계좌번호를 입력한 후 잔액을 확인하면 잔액이 보인다
이름을 입력하면 계좌가 생성된다
이름, 계좌번호를 입력하면 계좌가 상실된다
 */
public interface BankAccountService {


}
 /*
    * private int balance = 0;
    private int amount;
    private int deposit;
    private int withdraw;
    private int checkMyBalance;
    public int getBalance(){return this.balance;}
    public void setBalance(int balance){this.balance = balance;}
    public int getAmount(){return this.amount;}
    public void setAmount(int amount){this.amount = amount;}
    public int deposit(int amount) {  //입금을 담당하는 메소드
        balance += amount;
        return balance;}
    public int withdraw(int amount) {   //출금을 담당하는 메소드
        balance -= amount;
        return balance;}
    @Override
    public String toString() {return String.format("잔액은 %d입니다.\n", balance);}*/