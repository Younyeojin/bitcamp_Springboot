package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService {
    UtilDTO util = new UtilDTO();
    //public final static UtilDTO util = new UtilDTO();  원래는 상수였다!
    /*private UtilDTO util;  -초기화
      public UtilServiceImpl(){ this.util = new UtilDTO();}
    */

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
}
