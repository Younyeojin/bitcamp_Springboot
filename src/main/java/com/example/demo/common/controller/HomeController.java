package com.example.demo.common.controller;

import com.example.demo.Bicycle.controller.BicycleController;
import com.example.demo.Bicycle.domain.BicycleDTO;
import com.example.demo.bank.controller.BankAccountController;
import com.example.demo.bank.domain.BankAccountDTO;
import com.example.demo.bank.service.BankAccountService;
import com.example.demo.bank.service.BankAccountServiceImpl;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.util.controller.UtilController;

import java.util.Random;
import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        while (true) {
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.강아지 4.자전거정보 5.오늘날짜 6.비트은행");
            switch (scanner.next()) {
                case "0": return;
                case "1": new CalculatorController().calculate(); break;
                case "2": new CalculatorController().sequence(); break;
                case "3":
                    new DogController().main(); break;
                    /*DogDTO dog = new DogDTO();
                    System.out.println("이름이 뭔가요?");
                    dog.setName(scanner.next());
                    System.out.println("품종이 뭔가요?");
                    dog.setBreed(scanner.next());
                    System.out.println("색깔이 뭔가요?");
                    dog.setColor(scanner.next());
                    dogController.add(dog);
                    //System.out.println(dogController.barking("왈왈"));
                    break;
                case "33":
                    dogController.show();
                    break;*/
                case "4":
                    new BicycleController().main(); break;
                    /*BicycleDTO bicycle  = new BicycleDTO();
                    System.out.println("기어가 몇단인가요?");
                    bicycle.setGear(scanner.nextInt());
                    System.out.println("어디껀가요?");
                    bicycle.setCompany(scanner.next());
                    System.out.println("속도가 어떻게 되나요?");
                    bicycle.setSpeed(scanner.nextInt());
                    bicycleController.add(bicycle);
                    break;
                case "44":
                    bicycleController.show();
                    break;*/
                case "5": new UtilController().todayAndCurrentTime(); break;
                case "6": new BankAccountController().main(); break;
            }
        }
    }
}
                    /*System.out.println("계좌를 생성하시겠습니까?");
                    switch (scanner.next()) {
                        case "y":
                            break;
                        case "n":
                            return;    }
                    System.out.println("이름 무엇?");
                    bankAccount.setName(scanner.next());
                    bankAccountController.create(bankAccount);
                    System.out.println("당신의 계좌는:"+ bankAccount.getAccountNumber());
                    System.out.println("입금 얼마?");
                    bankAccount.setMoney(scanner.nextInt());
                    bankAccountController.deposit(bankAccount);
                    System.out.println("출금 얼마?");
                    bankAccount.setMoney(scanner.nextInt());
                    bankAccountController.withdraw(bankAccount);
                    System.out.println("잔액 얼마?");
                    System.out.println(bankAccount.getBalance());
                    bankAccountController.add(bankAccount);
                    break;
                case "66":
                    bankAccountController.show(bankAccount);
                    break;*/