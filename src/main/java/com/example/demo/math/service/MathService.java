package com.example.demo.math.service;

import com.example.demo.math.domain.MathDTO;

public interface MathService {
   // int add(int num1, int num2-노출되어있음)  :
    int add(MathDTO calculator);
    int subtract(MathDTO calculator);
    int multiple(MathDTO calculator);
    int divide(MathDTO calculator);
    int remain(MathDTO calculator);
    int[] sequence(MathDTO calculator);
    //int[] sequence2(CalculatorDTO calculator);
    //String [] blah();
    //CalculatorDTO[] c1();
}
