package com.pattern.bridge.withoutBridge;

public class BlueTruck extends Truck{

    @Override
    public void applyCarColor() {
        System.out.println("Making the truck blue.");
    }
}
