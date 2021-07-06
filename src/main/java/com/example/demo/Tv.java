package com.example.demo;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

class Speaker {
    int dolby;
    public String sound(){
        return "dolby sound ....";
    }
}
//상속
class SmartTv extends Speaker{
    int number;

    @Override
    public String toString(){
        System.out.println("오버라이딩 메소드");
        return "리턴값이 필요해";
    }
    @Override
    public String sound(){
        return "Tv dolby Sound";
    }
}


class TvControl {
    public static void main(String[] args) {
        Tv LGTv = new Tv("LG");
        Tv sTv = new Tv("Samsung");
        Tv hTv = new Tv("HP", 2048);



        /*오버로딩
        add (1,2);
        add (1.1,2.3); */

        System.out.println(hTv.toString());
        hTv.sound();

        System.out.println(hTv.current_channel);
        //System.out.println(hTv.getCurrent_channel());
        //hTv.current_channel = 111111111;
        hTv.setCurrent_channel(123456);
        System.out.println(hTv.current_channel);
        //System.out.println(hTv.getCurrent_channel());

        System.out.println(hTv.resolution);
        // Tv를 켜기
        // 볼륨 키우기
        // 채널 바꾸기
        //System.out.println(hTv.getChannel());
             //채널 대역대의 시작주소
        /*
        int[] arr = hTv.getChannel();
        for(int i=0; i<hTv.getChannel().length; i++){
            System.out.println(arr[i]);
            //Thread.sleep(500);
        }*/
    }
        /*add(5,3);  int
        add(3.3,6);  double

    public static int add(int x, int y){
        return x+y;
    }
    public static double add(double a1, double a2){
        return a1+a2;
    }*/
}
public class Tv extends Speaker {
    //속성
    String model_name;
    int[] channel; //참조변수
    //public int current_channel; //가능
    //private int current_channel; //접근 권한을 안줌
    int current_channel;
    int resolution;
    boolean power;

    static int password;
    static void display(){}

    //생성자
    Tv(String tv_name) {    //
        model_name = tv_name;
        resolution = 1024;
        power = false;
        current_channel = 0;
        channel = new int[100]; //몇개 생성할 것인가
        for (int i = 0; i < channel.length; i++) {   //length;길이
            channel[i] = i + 1;
        }
    }

    Tv(String tv_name, int resolution){    //
            model_name = tv_name;
            this.resolution = resolution;
            //resolution = resolution;
            power = false;
            current_channel = 0;
            channel = new int[100]; //몇개 생성할 것인가
            for(int i = 0; i < channel.length; i++){   //length;
                channel[i] = i +1;
            }
            /*for(int i = 0; i < 100; i++){   = for(int i = 0; i<channel.length; i++)
            // channel[i] = i + 1;
            //for(int j = 0; j< ){}   이중 반복문 */
            }
    //Getter Setter 마우스오른쪽-Generate-getter and setter
    public int getCurrent_channel() {
        return current_channel;
    }

    public void setCurrent_channel(int current_channel) {
        if(current_channel > 100){
            System.out.println("입력오류 : 없는 채널입니다.");
        } else {
            this.current_channel = current_channel;
        }
    }

    public int[] getChannel() {
        return channel;
    }

    public void setChannel(int[] channel) {
        this.channel = channel;
    }

}
        //public TvControl getTv() {
          //  return this;

        /*
        channel[0]
        channel[1]
        channel[2]
        channel[3]
        .
        .
        channel[98]
        channel[99]
         */

    //Getter Setter


    //기능
    /*boolean onOff(){
        System.out.println("Tv on~~~");
    } */
    //오버로딩
    /*public int add(int x, int y/*파라미터) {
        return x+y;
    }
    public double add(double x, double y){
        return x+y;
    }
        */