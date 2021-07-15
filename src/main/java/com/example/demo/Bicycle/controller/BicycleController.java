package com.example.demo.Bicycle.controller;

import com.example.demo.Bicycle.Service.BicycleService;
import com.example.demo.Bicycle.Service.BicycleServiceImpl;
import com.example.demo.Bicycle.domain.BicycleDTO;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class BicycleController extends LambdaUtils {
    private BicycleService bicycleService;
    private BicycleDTO bicycle;
    private Scanner scanner;

    //public void add(BicycleDTO bicycle){bicycleService.add(bicycle);   }
    public BicycleController(){
        this.bicycleService=new BicycleServiceImpl();
        this.bicycle=new BicycleDTO();
        this.scanner=new Scanner(System.in);
            }

    public void show(){
        print.accept("자전거의 수 : " + bicycleService.count());
        System.out.println(bicycleService.show());
    }
    public int count(){
        return bicycleService.count();
    }

    public void main() {
        BicycleDTO bicycle  = new BicycleDTO();
        print.accept("기어가 몇단인가요?\n");
        bicycle.setGear(scanner.nextInt());
        print.accept("어디껀가요?\n");
        bicycle.setCompany(scanner.next());
        print.accept("속도가 어떻게 되나요?\n");
        bicycle.setSpeed(scanner.nextInt());
        print.accept(bicycle.toString());
    }
    /*
    public void add(BicycleDTO bicycle){
        bicycleService.add(bicycle);
    }
        public void bicycle(){
        BicycleDTO bicycle  = new BicycleDTO();
        System.out.println("기어가 몇단인가요?");
        bicycle.setGear(scanner.nextInt());
        System.out.println("어디껀가요?");
        bicycle.setCompany(scanner.next());
        System.out.println("속도가 어떻게 되나요?");
        bicycle.setSpeed(scanner.nextInt());
        //System.out.printf("기어는 %d이고, %s꺼 이고, 속도는 %d입니다",bicycle.getGear(),bicycle.getCompany(),bicycle.getSpeed());
        System.out.print(bicycle.toString());
    }
         */
}
