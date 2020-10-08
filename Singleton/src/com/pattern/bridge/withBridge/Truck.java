package com.pattern.bridge.withBridge;

public class Truck extends Vehicle{

    public Truck(Color color) {
        super(color);
    }

    @Override
    public void applyCarColor() {
        color.applyCarColor();
    }
}
