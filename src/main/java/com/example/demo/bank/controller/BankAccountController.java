package com.example.demo.bank.controller;

import com.example.demo.Bicycle.Service.BicycleService;
import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;


import java.util.Random;
import java.util.Scanner;

public class BankAccountController {
    private BankAccountService bankAccountService;
    private Scanner scanner;
    private BankAccountDTO bankAccount;
    public BankAccountController() {
       bankAccountService = new BankAccountServiceImpl();
       bankAccount = new BankAccountDTO();
       scanner = new Scanner(System.in);
    }
    public void create(BankAccountDTO bankAccount){
        bankAccountService.createAccount(bankAccount);
    }
    public void add(BankAccountDTO bankAccount){
        bankAccountService.add(bankAccount);
    }
    public void show(BankAccountDTO bankAccount){
        System.out.println(bankAccountService.show());
    }
    public void deposit(BankAccountDTO bankAccount){
        bankAccountService.deposit(bankAccount);
    }
    public void withdraw(BankAccountDTO bankAccount){
        bankAccountService.withdraw(bankAccount);
    }
}
