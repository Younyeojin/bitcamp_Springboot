package com.example.demo.Bicycle.Service;

import com.example.demo.Bicycle.domain.BicycleDTO;

public class BicycleServiceImpl implements BicycleService{
    BicycleDTO bicycle = new BicycleDTO();
    @Override
    public String changingGear(String gear) {
        return null;
    }

    @Override
    public int changingPedalCadence(int time) {
        return 0;
    }

    @Override
    public String applyingBrakes() {
        return null;
    }
}
