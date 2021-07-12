package com.example.demo.common.controller;

import com.example.demo.Bicycle.controller.BicycleController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.math.controller.CalculatorController;
import com.example.demo.util.controller.UtilController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();
        UtilController utilController = new UtilController();
        while (true) {
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.강아지 4.자전거 5.오늘날짜");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    calculatorController.calculate();
                    break;
                case "2":
                    calculatorController.sequence();
                    break;
                case "3":
                    dogController.dog();
                    break;
                case "4":
                    bicycleController.bicycle();
                case "5":
                    utilController.getTodayAndCurrentTime();
                    break;      }


        }
    }
}
