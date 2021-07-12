package com.example.demo.util.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data    //밑에 getter,setter가 들어가있음
public class UtilDTO {
    private LocalDate today;
    private LocalTime currentTime;
}
