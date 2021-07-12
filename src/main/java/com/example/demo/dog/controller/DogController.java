package com.example.demo.dog.controller;



import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;

import java.util.Scanner;

public class DogController {
    private DogService dogService;
    private DogDTO dog;
    private Scanner scanner;
    public DogController(){
        this.dogService = new DogServiceImpl();
        this.dog = new DogDTO();
        this.scanner = new Scanner(System.in);
    }
      //DogDTO dog = new DogDTO();   //dog:가상
    public void dog(){
        System.out.println("이름이 뭔가요?");
        dog.setName(scanner.next());
        System.out.println("품종이 뭔가요?");
        dog.setBreed(scanner.next());
        System.out.println("색깔이 뭔가요?");
        dog.setColor(scanner.next());
        System.out.println("배고픈가요?");
        dog.setHungry(scanner.next());
        System.out.print(dog.toString());
    }



        /*System.out.println("이름이 뭔가요?");
        dog.setName(scanner.next());         //Dog class에 저장 -> Object를 본다(=지향한다)
        //String name = scanner.next();      //DogMain에 저장   -> 본체가 가지고 있다(=객체지향이 아니다)
        System.out.println("품종이 뭔가요?");
        dog.setBreed(scanner.next());
        //String breed = scanner.next();
        System.out.println("색깔이 뭔가요?");
        dog.setColor(scanner.next());
        //String color = scanner.next();
        System.out.println("배고픈가요?");
        dog.setHungry(scanner.next());
        //String hungry = scanner.next();
        //System.out.printf("이름은 %s이고, 품종은 %s이고, 색깔은 %s이고, 배고픔은 %s니다",dog.getName(),dog.getBreed(),dog.getColor(),dog.getHungry());
        //System.out.printf("이름은 %s이고, 품종은 %s이고, 색깔은 %s이고, 배고픔은 %s니다",name,breed,color,hungry);
        System.out.print(dog.toString());
    }*/
    }

