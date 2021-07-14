package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.util.service.UtilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService {
    private BankAccountDTO bankAccount;
    private List<BankAccountDTO> bankAccounts;
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
    public List<?> findAll() {
        return bankAccounts;
    }


    @Override
    public void  createAccount(BankAccountDTO bank) {
        UtilService utilService = new UtilServiceImpl();
        String first = utilService.randomNumbers(4);
        if(){}
        String accountNumber = first+"-"+
                utilService.randomNumbers(4)+"-"
        bank.setAccountNumber("");
        bankAccounts.add(bank);
            }
        /*Random random = new Random();
        String randomNumber = String.format("%d-%d-%d",random.nextInt(1000),random.nextInt(1000),random.nextInt(1000));
        bankAccount.setAccountNumber(randomNumber);
        return bankAccount.getAccountNumber();*/

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