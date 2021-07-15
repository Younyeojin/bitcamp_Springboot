package com.example.demo.dog.controller;



import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Scanner;


public class DogController {
    private DogServiceImpl dogService;
    public DogController(){
        dogService = new DogServiceImpl();
    }
    public void main(){
        Scanner scanner = new Scanner(System.in);
        DogDTO dog = null;
        while (true) {
            System.out.println("[Menu] 0-Exit 1-이름/품종/색깔 2-반려동물차트");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    dog = new DogDTO();
                    System.out.println("이름 : [     ]");
                    dog.setName(scanner.next());
                    dogService.createDogName(dog);
                    dog = new DogDTO();
                    System.out.println("품종 : [     ]");
                    dog.setBreed(scanner.next());
                    dogService.createDogBreed(dog);
                    dog = new DogDTO();
                    System.out.println("색깔 : [     ]");
                    dog.setColor(scanner.next());
                    dogService.createDogColor(dog);
                    break;
                /*case "2":
                    dog = new DogDTO();
                    System.out.println("품종 : [     ]");
                    dog.setBreed(scanner.next());
                    dogService.createDogBreed(dog);
                    break;
                case "3":
                    dog = new DogDTO();
                    System.out.println("색깔 : [     ]");
                    dog.setColor(scanner.next());
                    dogService.createDogColor(dog);
                    break;*/
                case "2":
                    System.out.println("반려동물 차트 : " + dogService.count());
                    System.out.println(dogService.show());
            }
        }
    }

    public void add(DogDTO dog) {
    }
}

        
    
   /* private DogService dogService;
    public DogController() {
        dogService = new DogServiceImpl();
    }
    public  void add(DogDTO dog) {
        dogService.add(dog);
    }
    public void show() {
        System.out.println("강아지의 수 : "+ dogService.count());
        System.out.println(dogService.show());
    }
    public int count(){
        return dogService.count();
    }
    public String barking(String bark) {
        return dogService.barking(bark);
    }


    public String fetching(String target) {
        return dogService.fetching(target);
    }


    public String waggingTail() {
        return dogService.waggingTail();
    }
}
        /*DogService dogService = new DogService() {
            @Override
            public String barking(String bark) {
                return null;
            }

            @Override
            public String fetching(String target) {
                return null;
            }

            @Override
            public String waggingTail() {
                return null;
            }
        }
    }
    public void addDog(DogDTO dog){
        dogs.add(dog); //추가한다
    }

    public void showDogs(){
        System.out.println(dogs);
    }


    /*private DogService dogService;
    private DogDTO dog;
    private Scanner scanner;
    public DogController(){
       // this.dogService = new DogServiceImpl();
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
    }*/



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


