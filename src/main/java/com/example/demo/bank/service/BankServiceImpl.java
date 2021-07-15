package com.example.demo.bank.service;

import com.example.demo.bank.domain.AccountDTO;
import com.example.demo.util.service.UtilServiceImpl;
import com.example.demo.util.service.*;
import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl extends LambdaUtils implements BankService {
    private final AccountDTO bankAccount;
    private final List<AccountDTO> bankAccounts;

    @Override
    public String count() {
        return string.apply(bankAccounts.size());
    }

    @Override
    public List<? extends AccountDTO> findAll() {
        return bankAccounts;
    }

    public BankServiceImpl() {
        bankAccount = new AccountDTO();
        bankAccounts = new ArrayList<>();
    }

    @Override
    public void createAccount(AccountDTO bank) {
        UtilService utilService = new UtilServiceImpl();
        String accountNumber = utilService.randomNumbers(4, false) + "-" +
                utilService.randomNumbers(4, true) + "-" +
                utilService.randomNumbers(4, true);
        bank.setAccountNumber(accountNumber);
        bankAccounts.add(bank);
    }

    @Override
    public String[] findAllAccountNumbers() {
        int count = strToInt.apply(count());
        String[] accountNumbers = new String[count];
        for (int i = 0; i < count; i++) {
            accountNumbers[i] = bankAccounts.get(i).getAccountNumber();
        }
        return accountNumbers;
    }

    @Override
    public String finBalance(AccountDTO bankAccount) {
        return bankAccount.getMoney();
    }

    @Override
    public String deposit(AccountDTO bankAccount) {
        int restMoney = strToInt.apply(bankAccount.getMoney());
        bankAccount.setMoney(restMoney + bankAccount.getMoney());
        return bankAccount.getMoney();
    }

    @Override
    public String withdraw(AccountDTO bankAccount) {
        return "";
    }

    @Override
    public void dropAccount(AccountDTO bankAccount) {
    }
}








        /*Random random = new Random();
        String randomNumber = String.format("%d-%d-%d",random.nextInt(1000),random.nextInt(1000),random.nextInt(1000));
        bankAccount.setAccountNumber(randomNumber);
        return bankAccount.getAccountNumber();*/













