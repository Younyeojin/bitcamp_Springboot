package com.example.demo.lecture;

public class ControlFlow {
    public static void main(String[] args) {
        //구구단 2X1 = 2
        for (int g = 1; g < 10; g++){
            System.out.print(g + "단 출력" + "\t\t");
        }
        System.out.println();
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++) {
                //System.out.println("2 X " + i + " = " + 2 * i);
                System.out.print(j + "X" + i + "=" + i * j +"\t\t");
            }
            System.out.println();
        }
        /*for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                //System.out.println("2 X " + i + " = " + 2 * i);
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println("----------");
        }*/
    }
}
        //sum = 1+2+3+....+100;
        /*int sum = 0; //초기화

        int i = 0; //초기화
        //while (조건식==true){}      ==같다 -=다르다
        while (i <= 100){    //조건이 중요할때 (for:횟수가 중요할때)
            sum += i; //+= 중복연산
            i++;
        }
        for(int i = 1; i <= 100; i++){
            sum2 += i;
        }
        //System.out.println(sum);
        System.out.println(sum2);
    }*/
