package com.example.demo.dog.service;

//barking, fetching, wagging tail
public interface DogService {          //자바 클래스 밖에 있는 함수

    //public void barking(String bark);  //기능정의
    //public void fetching(String target);
    //public void waggingTail();
    public String barking(String bark);
    public String fetching(String target);
    public String waggingTail();



}
