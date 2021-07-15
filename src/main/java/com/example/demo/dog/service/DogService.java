package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;

import java.util.List;

//barking, fetching, wagging tail
public interface DogService {          //인터페이스 : 자바 클래스 밖에 있는 함수
    void add(DogDTO dog); //컬랙션
    int count();
    List<? extends DogDTO> findAll();
    String barking(String bark);  //요구사항
    String fetching(String target);
    String waggingTail();
}
// List<DogDTO> show();

/*public void barking(String bark);  //기능정의 ;처음에 만들때
public void fetching(String target);
public void waggingTail();
void createDogName(DogDTO dog);
    void createDogBreed(DogDTO dog);
    void createDogColor(DogDTO dog);*/