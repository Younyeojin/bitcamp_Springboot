package com.example.demo.bank;

class Circle{
    //상수(Constant)
    final double PI = 3.141592;
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    //기능
    public double area(double rad){
        double result = rad*rad*3.14;
        return result;
    }
    public double area(Circle cir){
        double result = cir.radius*cir.radius*3.14;
        return result;
    }
}
public class BankAccountUnilD {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(3.0);
        System.out.println(c1.area(c1));
    }
}
class BankAccount01 {
    String accNumber; //계좌번호
    String ssNumber;  //주민번호
    int balnce = 0;   //예금잔액

    //초기화를 위한 메소드
    /*public void initAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balnce = bal;
    }*/
    //초기값을 바로 설정할 때
    public BankAccount01(String acc, String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balnce = bal;
    }
    public int deposit(int amount){
        balnce += amount;
        return balnce;
    }
    public int withdraw(int amount){
        balnce -= amount;
        return balnce;
    }
    public int checkMyBalance(){
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumber);
        System.out.println("잔   액: " + balnce +'\n'); //\n: 줄바꾸기 (escape sequence)
        //System.out.println();   => 한줄 띄기
        return balnce;
    }
}
class BankAccountUniID{
    public static void main(String[] args) {
        BankAccount01 yoon = new BankAccount01("12-34-89", "990990-9090990", 10000); //()안에 바로 초기값 입력
        //yoon.initAccount("12-34-89", "990990-9090990", 10000);
        BankAccount01 park = new BankAccount01("33-55-09", "770088-5959007", 10000);
        //park.initAccount("33-55-09", "770088-5959007", 10000);

        yoon.deposit(5000);
        park.deposit(5000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
