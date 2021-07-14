package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.util.service.UtilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.util.service.*;
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
    public String[] findAllAccountNumbers() {
        String[] sr = new String[count()];
        for (int i=0; i<count(); i++){
            sr[i] = bankAccounts.get(i).getAccountNumber();
        }
        return sr;
    }

    @Override
    public void  createAccount(BankAccountDTO bank) {
        UtilService utilService = new UtilServiceImpl();
        String accountNumber = utilService.randomNumbers(4 ,false)+"-"+
                utilService.randomNumbers(4, true)+"-"+
                utilService.randomNumbers(4, true);
        bank.setAccountNumber(accountNumber);
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