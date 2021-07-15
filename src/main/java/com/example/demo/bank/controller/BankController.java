package com.example.demo.bank.controller;

import com.example.demo.bank.domain.AccountDTO;
import com.example.demo.bank.service.BankService;
import com.example.demo.bank.service.BankServiceImpl;
import com.example.demo.util.service.LambdaUtils;


import java.util.List;
import java.util.Scanner;

public class BankController extends LambdaUtils {
    private BankService bankService;
    public BankController(){
        bankService = new BankServiceImpl();
    }
    public void main(){
        Scanner scanner = new Scanner(System.in);
        //BankAccountDTO account = new BankAccountDTO(); -> 이렇게되면 쓰레기는 계속 쌓이게되서 숫자가 중복으로 나옴
         AccountDTO account = null;
        while (true){
            System.out.println("[Menu] 0-Exit 1-계좌개설 2-계좌목록 3-계좌번호목록 4-입금");
            switch (scanner.next()){
                case "0":return;
                case "1":
                    account = new AccountDTO();
                    print.accept("이름 : ");
                    account.setName(scanner.next());
                    bankService.createAccount(account);
                    break;
                case "2":
                    print.accept("개설된 계좌 수 : \n"+bankService.count());
                    List<? extends AccountDTO> list=bankService.findAll();
                    for (AccountDTO a: list){
                        print.accept(a.toString());
                    }
                    break;
                    //System.out.println(UtilService.);
                case "3":
                    for (String s:bankService.findAllAccountNumbers()){
                        print.accept(s+"\n");
                    }
                    break;
                case "4":
                    print.accept("계좌번호 : ");
                    account = new AccountDTO();
                    account.setAccountNumber(scanner.next());
                    print.accept("입금액 : ");
                    account.setMoney(scanner.next());
                    break;
                case "5": break;
                case "6": break;
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
