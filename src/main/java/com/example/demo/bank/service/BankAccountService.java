package com.example.demo.bank.service;

import com.example.demo.Bicycle.domain.BicycleDTO;
import com.example.demo.bank.domain.BankAccountDTO;
import lombok.Data;

import java.util.List;

/*
은행이름은 상수로 정한다
이름을 입력하면 계좌가 생성된다 단 계좌번호는 ****-****-****이고 랜덤값이다
금액, 계좌번호를 입력한 후 입금한 후 잔액을 확인한다
금액, 계좌번호를 입력한 후 출금한 후 잔액을 확인한다
금액, 계좌번호를 입력한 후 잔액을 확인하면 잔액이 보인다

이름, 계좌번호를 입력하면 계좌가 상실된다
 */

public interface BankAccountService {
    void createAccount(BankAccountDTO bankAccount);
    String  count();
    List<?> findAll();
    String [] findAllAccountNumbers();
    String finBalance(BankAccountDTO bankAccount);
    String deposit(BankAccountDTO bankAccount);
    String withdraw(BankAccountDTO bankAccount);
    void dropAccount(BankAccountDTO bankAccount);


}

