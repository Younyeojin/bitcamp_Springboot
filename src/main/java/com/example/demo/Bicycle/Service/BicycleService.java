package com.example.demo.Bicycle.Service;

import com.example.demo.Bicycle.domain.BicycleDTO;

import java.util.List;

//changing gear, changing pedal cadence, applying brakes
public interface BicycleService {
    void add(BicycleDTO bicycle);
    int count();
    List<BicycleDTO> show();
     String changingGear(String gear);
     int changingPedalCadence(int time);
     String applyingBrakes();

}
