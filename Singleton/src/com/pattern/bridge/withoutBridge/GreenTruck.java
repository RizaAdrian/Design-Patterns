package com.pattern.bridge.withoutBridge;

public class GreenTruck extends Truck{

    @Override
    public void applyCarColor() {
        System.out.println("Making the truck green.");
    }
}
