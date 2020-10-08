package com.pattern.bridge.withBridge;

public class Red implements Color{

    @Override
    public void applyCarColor() {
        System.out.println("Applying the red color.");
    }
}
