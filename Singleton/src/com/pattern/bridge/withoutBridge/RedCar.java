package com.pattern.bridge.withoutBridge;

public class RedCar extends Car{

    @Override
    public void applyCarColor() {
        System.out.println("Making the car red.");
    }
}
