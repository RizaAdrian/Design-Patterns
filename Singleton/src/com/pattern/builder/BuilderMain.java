package com.pattern.builder;

public class BuilderMain {
    public static void main(String[] args){
        CarParts.Builder builder = new CarParts.Builder();

        builder.brakes("AEM Brackes").engine("Modify Engine").transmission("Reinforced Transmission").gearbox("Plug and play gearbox");

        CarParts carParts = builder.build();

        System.out.println(carParts.getBrakes());
        System.out.println(carParts.getEngine());
        System.out.println(carParts.getTransmission());
        System.out.println(carParts.getGearbox());
    }
}
