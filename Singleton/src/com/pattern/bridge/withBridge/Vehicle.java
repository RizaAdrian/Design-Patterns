package com.pattern.bridge.withBridge;

public abstract class Vehicle {

    protected Color color;

    public Vehicle(Color color){
        this.color = color;
    }

    public abstract void applyCarColor();

}
