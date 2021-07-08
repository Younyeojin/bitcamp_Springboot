package com.example.demo.math.controller;

import com.example.demo.math.domain.CalculatorDTO;
import com.example.demo.math.service.CalculatorService;
import com.example.demo.math.service.CalculatorServiceImpl;

import java.util.Scanner;
public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorDTO calculator = new CalculatorDTO();
        CalculatorService calculatorService = new CalculatorServiceImpl() {}; //인스턴스 생성
        System.out.println("숫자 1 ?");
        calculator.setNum1(scanner.nextInt());
        System.out.println("연산자");
        calculator.setOpcode(scanner.next());
        System.out.println("숫자 2 ?");
        calculator.setNum2(scanner.nextInt());
        /*if(opcode.equals("+")){

        }else if(opcode.equals("-")){

        }else if(opcode.equals("*")){

        }else if(opcode.equals("/")){

        }*/
        int result = 0;

        switch (calculator.getOpcode()){
            /*case "+": result = calculator.getNum1() + calculator.getNum2();
            case "-": result = calculator.getNum1() - calculator.getNum2();
                break;
            case "*": result = calculator.getNum1() * calculator.getNum2();
                break;
            case "/": result = calculator.getNum1() / calculator.getNum2();
                break;
            case "%": result = calculator.getNum1() % calculator.getNum2();
                break;*/
            case "+": result = calculatorService.add(calculator);
                break;
            case "-": result = calculatorService.subtract(calculator);
                break;
            case "*": result = calculatorService.multiple(calculator);
                break;
            case "/": result = calculatorService.divide(calculator);
                break;
            case "%": result = calculatorService.remain(calculator);
                break;

        }
        //calculator.setOpcode("+");

        //System.out.print(calculator.toString() + result);
        System.out.printf("%d %s %d = %d",
        calculator.getNum1(),
        calculator.getOpcode(),
        calculator.getNum2(),
        result);
    }
}