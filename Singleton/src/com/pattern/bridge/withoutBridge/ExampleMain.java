package com.pattern.bridge.withoutBridge;

public class ExampleMain {

    public static void main(String[] args){
    /*
     * Here if we want to add a new color to the car or truck
     * for example the GreenCar or GreenTruck we will need to create 2 more classes
    */

        Car car = new BlueCar();
        Truck truck = new RedTruck();
        Car greenCar = new GreenCar();

        car.applyCarColor();
        truck.applyCarColor();
        greenCar.applyCarColor();
    }
}
