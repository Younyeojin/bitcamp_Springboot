package com.example.demo.dog.domain;

// state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import lombok.Data;

import java.util.Scanner;
@Data
public class DogDTO {
    private String name;
    private String breed;
    private String color;

    @Override
    public String toString() {
        //return String.format("이름은 %s이고, 품종은 %s이고, 색깔은 %s이고, 배고픔은 %s니다",name,breed,color,hungry);
        return String.format("이름은 %s이고, 품종은 %s이고, 색깔은 %s인 강아지가 ",name,breed,color);

    }
}

    //멤버함수
    //set (spoiler) get (consumer)
    /*public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setHungry(String hungry){
        this.hungry = hungry;
    }
    public String getHungry(){
         //if
        return this.hungry;
    }*/


