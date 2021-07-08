package com.example.demo.Bicycle.domain;

import java.util.Scanner;

public class BicycleDTO {
    private int gear;
    private String company;
    private int speed;
    public void setGear(int gear){
        this.gear = gear;
    }
    public int getGear(){
        return this.gear;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public String getCompany(){
        return this.company;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }

    @Override
    public String toString() {
        return String.format("기어는 %d이고, %s꺼 이고, 속도는 %d입니다",gear,company,speed);
    }
}
