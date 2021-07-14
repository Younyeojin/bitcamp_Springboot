package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService {
    //UtilDTO util = new UtilDTO();
    //public final static UtilDTO util = new UtilDTO();  원래는 상수였다!
    private UtilDTO util;  //초기화
    public UtilServiceImpl(){ util = new UtilDTO();}

    @Override
    public LocalDate today() {
        util.setToday(LocalDate.now());
        return util.getToday();
    }

    @Override
    public LocalTime currentTime() {
        util.setCurrentTime(LocalTime.now());
        return util.getCurrentTime();
    }

    @Override
    public String todayAndCurrentTime() {
        return String.format("%s %s", today(), currentTime());
    }

    @Override
    public String randomNumbers(int digits) {
        //Math.random() : 클래스 메소드-한번만 사용가능
        //Random random = new Random()
        //random.nextInt(1000);  : 인스턴스 메소드-여러번 사용가능
        String result = "";
        for (int i=0; i<digits; i++){
            result += (int)(Math.random()*10); //->0012 같은 숫자가 나왔을때를 대비한 식
        }
        return result;
    }
}
