package com.example.demo.Bicycle.Service;

import com.example.demo.Bicycle.domain.BicycleDTO;

import java.util.ArrayList;
import java.util.List;

public class BicycleServiceImpl implements BicycleService{

    private final List<BicycleDTO> bicycles;
    public BicycleServiceImpl(){
        bicycles = new ArrayList<>();
    }
    @Override
    public void add(BicycleDTO bicycle) {
        bicycles.add(bicycle);
    }
    @Override
    public int count() {
        return bicycles.size();
    }
    @Override
    public List<? extends BicycleDTO> show() {
        return bicycles;
    }
    @Override
    public void changingGear() {
    }
    @Override
    public void changingPedalCadence() {
    }
    @Override
    public void applyingBrakes() {
    }

}
