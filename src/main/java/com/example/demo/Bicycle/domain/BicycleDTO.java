package com.example.demo.Bicycle.domain;

import lombok.Data;

import java.util.Scanner;
@Data
public class BicycleDTO {
    private String gear;
    private String pedal;
    private String speed;

    @Override
    public String toString() {
        return String.format("기어: %단 \n페달: %s \n스피드: %sKm",gear,pedal,speed);
    }
}
   /* public void setGear(int gear){
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
*/

