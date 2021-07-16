package com.example.demo.bank.service;

import com.example.demo.bank.domain.AccountDTO;
import com.example.demo.util.service.UtilServiceImpl;
import com.example.demo.util.service.*;
import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl extends LambdaUtils implements BankService {

    private final List<AccountDTO> accounts;

    @Override
    public String count() {
        return string.apply(accounts.size());
    }

    @Override
    public List<? extends AccountDTO> findAll() {
        return accounts;
    }

    public BankServiceImpl() {
        accounts = new ArrayList<>();
    }
    @Override
    public void createAccount(AccountDTO bank) {
        UtilService utilService = new UtilServiceImpl();
        String accountNumber = utilService.randomNumbers(4, false) + "-" +
                utilService.randomNumbers(4, true) + "-" +
                utilService.randomNumbers(4, true);
        bank.setAccountNumber(accountNumber);
        bank.setBalance("0");
        bank.setDate(utilService.todayAndCurrentTime());
        bank.setInterest("0.01");
        accounts.add(bank);
    }
    @Override
    public String[] findAllAccountNumbers() {
        int count = strToInt.apply(count());
        String[] accountNumbers = new String[count];
        for (int i = 0; i < count; i++) {
            accountNumbers[i] = accounts.get(i).getAccountNumber();
        }
        return accountNumbers;
    }
    @Override
    public AccountDTO findAccountByAccountNumber(String accountNumber) {
        AccountDTO account = null;
        for (AccountDTO a: accounts){
            if (a.getAccountNumber().equals(accountNumber)){
                account = a;
                break;
            }
        }
        return account;
    }
    @Override
    public String findBalanceByAccountNumber(String accountNumber) {
        String balance = "";
        for (AccountDTO a:accounts){
            balance = a.getAccountNumber().equals(accountNumber)? a.getBalance():"0";
            break;
        }
        return balance;
    }
/*
    @Override
    public AccountDTO deposit(AccountDTO param) {
        AccountDTO account = findAccountByAccountNumber(param.getAccountNumber());
        int restMoney = strToInt.apply(account.getMoney());
        account.setMoney(restMoney + param.getMoney());
        for (AccountDTO a:accounts){
            if (a.getAccountNumber().equals(account.getAccountNumber())){
                a.setBalance(account.getMoney());
                account = a;
            }
        }
        return account;
    }*/  //findAccountByAccountNumber에서 꺼내서 사용
    @Override
    public void deposit(AccountDTO param) {
        for(AccountDTO a : accounts){
        if (param.getAccountNumber().equals(a.getAccountNumber())){
            int balance = strToInt.apply(a.getBalance());
            a.setBalance(string.apply(balance+strToInt.apply(param.getMoney())));
            print.accept("입금 후 잔액: "+a);
            break;
        }else {
            print.accept("해당 계좌가 존재하지 않습니다");
        }
    }
}  //꺼내지 않고 그대로 사용
    @Override
    public void withdraw(AccountDTO param) {
        for (AccountDTO a : accounts){
            if (param.getAccountNumber().equals(a.getAccountNumber())){
                int balance = strToInt.apply(a.getBalance());
                a.setBalance(string.apply(balance-strToInt.apply(param.getMoney())));
                print.accept("출금 후 잔액: "+a);
                break;
            }else {
                print.accept("해당 계좌가 존재하지 않습니다");
            }
        }

    }

    @Override
    public void dropAccount(AccountDTO bank) {
    }
}








        /*Random random = new Random();
        String randomNumber = String.format("%d-%d-%d",random.nextInt(1000),random.nextInt(1000),random.nextInt(1000));
        bankAccount.setAccountNumber(randomNumber);
        return bankAccount.getAccountNumber();*/













