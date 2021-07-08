package com.example.demo.Bicycle.Service;

//changing gear, changing pedal cadence, applying brakes
public interface BicycleService {
    public String changingGear(String gear);
    public int changingPedalCadence(int time);
    public String applyingBrakes();

}
