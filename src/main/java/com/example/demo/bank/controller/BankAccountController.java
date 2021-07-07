package com.example.demo.bank.controller;

import com.example.demo.bank.domain.BankAccount;


import java.util.Scanner;

public class BankAccountController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //두개의 인스턴스 생성
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();
        System.out.println("얼마를 입금하시겠습니까?");
        yoon.setAmount(scanner.nextInt());
        park.setAmount(scanner.nextInt());
        yoon.deposit(yoon.getAmount());
        park.deposit(park.getAmount());
        System.out.println("얼마를 출금하시겠습니까?");
        yoon.setAmount(scanner.nextInt());
        park.setAmount(scanner.nextInt());
        yoon.withdraw(yoon.getAmount());
        park.withdraw(park.getAmount());
        System.out.print(yoon.toString());
        System.out.print(park.toString());
    }
}
