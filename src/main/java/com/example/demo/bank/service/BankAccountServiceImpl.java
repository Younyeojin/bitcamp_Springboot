package com.example.demo.bank.service;

import com.example.demo.bank.domain.BankAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountServiceImpl implements BankAccountService {
    @Autowired //생성자랑 이어줌
    private BankAccountDTO bankAccount;
    /*public BankAccountServiceImpl(){
        bankAccount = new BankAccountDTO();
    }*/
    @Autowired private BankAccountDTO[] bankAccounts;

    @Override
    public String name(BankAccountDTO bankAccount) {
        return null;
    }

    @Override
    public boolean newAccount(BankAccountDTO bankAccount) {
        return true;
    }

    @Override
    public void createAccount(BankAccountDTO bank) {
        bankAccount = new BankAccountDTO();
        String randomNumber = "";
        bankAccount.setAccountNumber(randomNumber);
        bankAccount.setName(bank.getName());
    }

    /*@Override
    public int balance(BankAccountDTO bank) {
      bankAccount.setBalanc();
      return bankAccount.getBalance();
    }*/
    @Override
    public int findBalance(BankAccountDTO bankAccount) {
        return bankAccount.getMoney();
    }

    @Override
    public int deposit(BankAccountDTO bankAccount) {
        bankAccount.setBalance(bankAccount.getBalance()+ bankAccount.getMoney());
        return bankAccount.getBalance();
    }

    @Override
    public int withdraw(BankAccountDTO bankAccount) {
        bankAccount.setBalance(bankAccount.getBalance()- bankAccount.getMoney());
        return bankAccount.getBalance();
    }

    @Override
    public void dropAccount(BankAccountDTO bankAccount) {

    }
}
