package com.example.demo.Bicycle.Service;

import com.example.demo.Bicycle.domain.BicycleDTO;

import java.util.List;

//changing gear, changing pedal cadence, applying brakes
public interface BicycleService {
     void add(BicycleDTO bicycle);
     int count();
    List<? extends BicycleDTO> show();
     void changingGear();
     void changingPedalCadence();
     void applyingBrakes();

}
