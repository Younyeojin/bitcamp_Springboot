package com.example.demo.dog;

// state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import java.util.Scanner;

class Dog{
    private String name;
    private String breed;
    private String color;
    private String hungry;

    //멤버함수
    //set (spoiler) get (consumer)
    public void setName(String name){
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
    }

    @Override
    public String toString() {
        //return String.format("이름은 %s이고, 품종은 %s이고, 색깔은 %s이고, 배고픔은 %s니다",name,breed,color,hungry);
        return String.format("이름은 %s이고, 품종은 %s이고, 색깔은 %s이고, 배고픔은 %s니다",this.name,this.breed,this.color,this.hungry);

    }
}
public class DogMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();   //dog:가상
        System.out.println("이름이 뭔가요?");
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
    }
}
