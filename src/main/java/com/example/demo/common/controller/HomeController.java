package com.example.demo.common.controller;

import com.example.demo.math.controller.CalculatorController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        while (true) {
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    calculatorController.calculate();
                    break;
                case "2":
                    ;
                    calculatorController.sequence();
                    break;
            }
        }
    }
}
