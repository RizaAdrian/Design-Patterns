package com.pattern.bridge.withoutBridge;

public class RedTruck extends Truck{

    @Override
    public void applyCarColor() {
        System.out.println("Making the truck red.");
    }
}
