package com.example.demo.Bicycle.controller;

import com.example.demo.Bicycle.domain.BicycleDTO;

import java.util.Scanner;

public class BicycleController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BicycleDTO bicycle = new BicycleDTO();
        System.out.println("기어가 몇단인가요?");
        bicycle.setGear(scanner.nextInt());
        System.out.println("어디껀가요?");
        bicycle.setCompany(scanner.next());
        System.out.println("속도가 어떻게 되나요?");
        bicycle.setSpeed(scanner.nextInt());
        //System.out.printf("기어는 %d이고, %s꺼 이고, 속도는 %d입니다",bicycle.getGear(),bicycle.getCompany(),bicycle.getSpeed());
        System.out.print(bicycle.toString());
    }
}
