package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.util.service.UtilServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.util.service.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountServiceImpl extends LambdaUtils implements BankAccountService {
    private final BankAccountDTO bankAccount;
    private final List<BankAccountDTO> bankAccounts;
    @Override
    public String count() {
        return string.apply(bankAccounts.size());
    }
    @Override
    public List<?> findAll() {
        return bankAccounts;
    }
    public BankAccountServiceImpl(){
        bankAccount = new BankAccountDTO();
        bankAccounts = new ArrayList<>();
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
    @Override
    public String[] findAllAccountNumbers() {
        int count = strToInt.apply(count());
        String[] accountNumbers = new String[count];
        for (int i=0; i<count; i++){
            accountNumbers[i] = bankAccounts.get(i).getAccountNumber();
        }
        return accountNumbers;
    }
    @Override
    public String  finBalance(BankAccountDTO bankAccount) {
        return bankAccount.getMoney();
    }
    @Override
    public String deposit(BankAccountDTO bankAccount) {
        int restMoney = strToInt.apply(bankAccount.getMoney());
        bankAccount.setMoney(restMoney+ bankAccount.getMoney());
        return bankAccount.getMoney();    }
    @Override
    public String withdraw(BankAccountDTO bankAccount) {return ""; }
    @Override
    public void dropAccount(BankAccountDTO bankAccount) {

    }








        /*Random random = new Random();
        String randomNumber = String.format("%d-%d-%d",random.nextInt(1000),random.nextInt(1000),random.nextInt(1000));
        bankAccount.setAccountNumber(randomNumber);
        return bankAccount.getAccountNumber();*/













}