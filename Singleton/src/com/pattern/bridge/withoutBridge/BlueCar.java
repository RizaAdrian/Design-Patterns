package com.pattern.bridge.withoutBridge;

public class BlueCar extends Car{

    @Override
    public void applyCarColor() {
        System.out.println("Making the car blue.");
    }
}
