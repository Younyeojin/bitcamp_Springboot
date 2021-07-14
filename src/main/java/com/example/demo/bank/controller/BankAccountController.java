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
        BankAccountDTO account = null;
        while (true){
            System.out.println("[Menu] 0-Exit 1-계좌개설 2-계좌목록");
            switch (scanner.next()){
                case "0":return;
                case "1":
                    account = new BankAccountDTO();
                    System.out.println("이름 : [      ]");
                    account.setName(scanner.next());
                    bankAccountService.createAccount(account);
                    break;
                case "2":
                    System.out.println("개설된 계좌 수 : "+bankAccountService.count());
                    System.out.println(bankAccountService.findAll());
                    //System.out.println(UtilService.);
                    break;
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
