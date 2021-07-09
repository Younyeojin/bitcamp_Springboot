package com.example.demo.math.service;

import com.example.demo.math.domain.CalculatorDTO;

import java.util.Scanner;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(CalculatorDTO calculator) {
        return calculator.getNum1() + calculator.getNum2();
    }

    @Override
    public int subtract(CalculatorDTO calculator) {
        return calculator.getNum1() - calculator.getNum2();
    }

    @Override
    public int multiple(CalculatorDTO calculator) {
        return calculator.getNum1() * calculator.getNum2();
    }

    @Override
    public int divide(CalculatorDTO calculator) {
        return calculator.getNum1() / calculator.getNum2();
    }

    @Override
    public int remain(CalculatorDTO calculator) {
        return calculator.getNum1() % calculator.getNum2();
    }

    /*@Override
    public String[] blah() {
        String[] blah = new String[100];
        return blah;
    }

    @Override
    public CalculatorDTO[] c1() {
        CalculatorDTO[] arr = new CalculatorDTO[10];
        return arr;
    }

    @Override
    public int[] sequence2(CalculatorDTO calculator) {
        int[] arr = new int[20];
        for (int i=5; i<=25; i++){}
        return arr;
    }*/

    @Override
    public int[] sequence(CalculatorDTO calculator) {
        int count = calculator.getNum2()- calculator.getNum1() +1;
        int[] arr = new int[count];
        int i =0;
        for (int j=calculator.getNum1(); j <= calculator.getNum2(); j++){
        arr[i] = j;
        i++;
        }
        return arr;
    }


}

/*if(){}  //Statement의 기본형
        switch (){}
        for (){}
        while(){}*/