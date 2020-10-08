package com.pattern.bridge.withBridge;

public class ExampleBridgeMain {

    public static void main(String[] args){
        Color blueColor = new Blue();
        Color redColor = new Red();
        Color greenColor = new Green();

        Vehicle car = new Car(blueColor);
        Vehicle suv = new Car(greenColor);

        Vehicle truck = new Truck(redColor);

        car.applyCarColor();
        suv.applyCarColor();
        truck.applyCarColor();

    }

}
