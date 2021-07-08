package com.example.demo.math.service;

import com.example.demo.math.domain.CalculatorDTO;

public interface CalculatorService {
   // int add(int num1, int num2-노출되어있음)  :
    int add(CalculatorDTO calculator);
    int subtract(CalculatorDTO calculator);
    int multiple(CalculatorDTO calculator);
    int divide(CalculatorDTO calculator);
    int remain(CalculatorDTO calculator);

}
