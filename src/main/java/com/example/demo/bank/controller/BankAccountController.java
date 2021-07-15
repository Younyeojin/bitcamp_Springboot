package com.example.demo.bank.controller;

import com.example.demo.Bicycle.Service.BicycleService;
import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;
import com.example.demo.util.service.UtilServiceImpl;


import java.util.Random;
import java.util.Scanner;

public class BankAccountController {
    private BankAccountServiceImpl bankAccountService;
    public BankAccountController(){
        bankAccountService = new BankAccountServiceImpl();
    }
    public void main(){
        Scanner scanner = new Scanner(System.in);
        //BankAccountDTO account = new BankAccountDTO(); -> 이렇게되면 쓰레기는 계속 쌓이게되서 숫자가 중복으로 나옴
         BankAccountDTO account = null;
        while (true){
            System.out.println("[Menu] 0-Exit 1-계좌개설 2-계좌목록 3-계좌번호목록");
            switch (scanner.next()){
                case "0":return;
                case "1":
                    account = new BankAccountDTO();
                    System.out.println("이름 : [    ]");
                    account.setName(scanner.next());
                    bankAccountService.createAccount(account);
                    break;
                case "2":
                    System.out.println("개설된 계좌 수 : "+bankAccountService.count());
                    System.out.println(bankAccountService.findAll());
                    //System.out.println(UtilService.);
                    break;
                case "3":
                    for (String s:bankAccountService.findAllAccountNumbers()){
                        System.out.println(s+"\n");
                    }
                case "4":
                    System.out.println("계좌번호 : [    ]");
                    account = new BankAccountDTO();
                    account.setAccountNumber(scanner.next());
                    System.out.println("입금액 : [    ]");
                    account.setMoney(scanner.next());

                case "5":
                case "6":
            }
        }
    }
    /*private Scanner scanner;
    //private BankAccountDTO bankAccount;
    public BankAccountController() {
       bankAccountService = new BankAccountServiceImpl();
       bankAccount = new BankAccountDTO();
       scanner = new Scanner(System.in);
    }
   /* public void create(BankAccountDTO bankAccount){
        bankAccountService.createAccount(bankAccount);
    }
    public void add(BankAccountDTO bankAccount){
        bankAccountService.add(bankAccount);
    }
    public void deposit(BankAccountDTO bankAccount){
        bankAccountService.deposit(bankAccount);
    }
    public void withdraw(BankAccountDTO bankAccount){
        bankAccountService.withdraw(bankAccount);
    }*/
}
