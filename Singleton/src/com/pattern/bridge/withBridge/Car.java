package com.pattern.bridge.withBridge;

public class Car extends Vehicle{

    public Car(Color color) {
        super(color);
    }

    @Override
    public void applyCarColor() {
        color.applyCarColor();
    }
}
