package com.example.demo.bank.controller;

import com.example.demo.Bicycle.Service.BicycleService;
import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;


import java.util.Random;
import java.util.Scanner;

public class BankAccountController {
    /*private BankAccountService bankAccountService;
    private Scanner scanner;
    private BankAccountDTO bankAccount;*/
    public static void main(String[] args) {
        Random rand = new Random();
        //for (long l =0;  l<1; l++)
        //  System.out.println(String.format("%d - %d - %d",rand.nextInt(10000),rand.nextInt(10000),rand.nextInt(10000)));
            System.out.println(rand.nextInt(10000)+"-"+rand.nextInt(10000)+"-"+rand.nextInt(10000));
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO bankAccount = new BankAccountDTO();
        BankAccountService bankAccountService= new BankAccountServiceImpl();
        System.out.println("입금 얼마?");
        bankAccount.setMoney(scanner.nextInt());
        bankAccountService.deposit(bankAccount);
        System.out.println("출금 얼마?");
        bankAccount.setMoney(scanner.nextInt());
        bankAccountService.withdraw(bankAccount);
        System.out.println("잔액 얼마?");
        System.out.println(bankAccount.getBalance());


        //두개의 인스턴스 생성
        //BankAccountDTO yoon = new BankAccountDTO();
        //BankAccountDTO park = new BankAccountDTO();
        //System.out.println("얼마를 입금하시겠습니까?");

        /*yoon.setAmount(scanner.nextInt());
        park.setAmount(scanner.nextInt());
        yoon.deposit(yoon.getAmount());
        park.deposit(park.getAmount());
        System.out.println("얼마를 출금하시겠습니까?");
        yoon.setAmount(scanner.nextInt());
        park.setAmount(scanner.nextInt());
        yoon.withdraw(yoon.getAmount());
        park.withdraw(park.getAmount());
        System.out.print(yoon.toString());
        System.out.print(park.toString());*/
    }
}
