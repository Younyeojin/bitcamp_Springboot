package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class DogServiceImpl implements DogService {
    private final DogDTO dog;
    private final List<DogDTO> dogs; //추상화

    public DogServiceImpl(){
        dog = new DogDTO();
        dogs = new ArrayList<>();
    }   //캡슐화
    @Override
    public void add(DogDTO dog) {
        dogs.add(dog) ;
    }
    @Override
    public int count() {
        return dogs.size();
    }
    @Override
    public List<? extends DogDTO> findAll() {
        return dogs;
    }
    @Override
    public String barking(String bark) {
        return dog.toString() + bark + " 짖는다";
    }

    @Override
    public String fetching(String target) {
        return dog.toString() + target + "을 물어온다";
    }

    @Override
    public String  waggingTail() {
        return dog.toString() + "꼬리를 흔든다";
    }
}


    /*@Override
    public void createDogBreed(DogDTO dog) {
        DogService dogService = new DogServiceImpl();
    }

    @Override
    public void createDogColor(DogDTO dog) {
        DogService dogService = new DogServiceImpl();
    }

    @Override
    public void createDogName(DogDTO dog) {
        DogService dogService = new DogServiceImpl();
    }



    @Override
    public List<DogDTO> show() {
        return dogs;
    }*/




