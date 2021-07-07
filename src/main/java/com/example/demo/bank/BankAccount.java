package com.example.demo.bank;

public class BankAccount {
    private int balance = 0;
    private int amount;
    private int deposit;
    private int withdraw;
    private int checkMyBalance;
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getAmount(){
        return this.amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public int deposit(int amount) {  //입금을 담당하는 메소드
        balance += amount;
        return balance;
    }
    public int withdraw(int amount) {   //출금을 담당하는 메소드
        balance -= amount;
        return balance;
    }

    @Override
    public String toString() {
        return String.format("잔액은 %d입니다.\n", balance);
    }
}