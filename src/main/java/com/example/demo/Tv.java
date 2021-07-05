package com.example.demo;

class Tv2 {
    public static void main(String[] args) {
        Tv LGTv = new Tv("LG");
        Tv sTv = new Tv("Samsung");
        Tv hTv = new Tv("HP", 2048);

        //System.out.println(hTv.current_channel);
        System.out.println(hTv.getCurrent_channel());
        //hTv.current_channel = 11;
        hTv.setCurrent_channel(11);
        //System.out.println(hTv.current_channel);
        System.out.println(hTv.getCurrent_channel());

        System.out.println(hTv.resolution);
        // Tv를 켜기
        // 볼륨 키우기
        // 채널 바꾸기
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
public class Tv {
    //속성
    String model_name;
    int[] channel; //참조변수
    //public int current_channel; //가능
    private int current_channel; //접근 권한을 안줌
    int resolution;
    boolean power;

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

    public int getCurrent_channel() {
        return current_channel;
    }

    public void setCurrent_channel(int current_channel) {
        this.current_channel = current_channel;
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


