package com.example.demo.common.controller;

import com.example.demo.Bicycle.controller.BicycleController;
import com.example.demo.bank.controller.BankAccountController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.util.controller.UtilController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        while (true) {
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.강아지 33.개목록 4.자전거 5.오늘날짜 6.은행");
            switch (scanner.next()) {
                case "0": return;
                case "1": new CalculatorController().calculate(); break;
                case "2": new CalculatorController().sequence(); break;
                case "3":
                    DogDTO dog = new DogDTO();
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
                    break;
                case "4": new BicycleController().bicycle(); break;
                case "5": new UtilController().getTodayAndCurrentTime(); break;
                case "6": new BankAccountController().setBankAccount(); break;
            }
        }
    }
}
