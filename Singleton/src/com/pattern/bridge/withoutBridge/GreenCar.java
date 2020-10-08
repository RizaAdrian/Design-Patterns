package com.pattern.bridge.withoutBridge;

public class GreenCar extends Car{

    @Override
    public void applyCarColor() {
        System.out.println("Making the car green.");
    }
}
