package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService {
    private BankAccountDTO bankAccount;
    private ArrayList<BankAccountDTO> bankAccounts;
    public BankAccountServiceImpl(){
        bankAccount = new BankAccountDTO();
        bankAccounts = new ArrayList<>();
    }
    @Override
    public void add(BankAccountDTO bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public int count() {
        return bankAccounts.size();
    }

    @Override
    public List<BankAccountDTO> show() {
        return bankAccounts;
    }

    @Override
    public String  createAccount(BankAccountDTO bankAccount) {
        Random random = new Random();
        String randomNumber = String.format("%d-%d-%d",random.nextInt(1000),random.nextInt(1000),random.nextInt(1000));
        bankAccount.setAccountNumber(randomNumber);
        return bankAccount.getAccountNumber();
    }

    @Override
    public String name(String name) {
        return null;
    }

    @Override
    public int finBalance(int balance) {
        return bankAccount.getMoney();
    }

    @Override
    public int deposit(BankAccountDTO bankAccount) {
        bankAccount.setBalance(bankAccount.getBalance()+ bankAccount.getMoney());
        return bankAccount.getBalance();    }

    @Override
    public int withdraw(BankAccountDTO bankAccount) {
        bankAccount.setBalance(bankAccount.getBalance()- bankAccount.getMoney());
        return bankAccount.getBalance();    }

    @Override
    public void dropAccount() {

    }




}