package com.example.demo.bank.domain;

public class BankAccount {

        int balance = 0; //예금 잔액

        /*private int deposit(int amount)*/
        public int deposit(int amount) {  //public : 접근제어자
            balance += amount;
            return balance;
        }

        public int withdraw(int amount) {
            balance -= amount;
            return balance;
        }

        public int checkMyBalance() {
            System.out.println("잔액 : " + balance);
            return balance;
        }
    }
