package org.example.class17;

public class Vehicle {
    String model;
    String color;
}

class Car extends Vehicle {

    int noOfDoors;
}

class BMW extends Car {

    void printColor(){
        System.out.println(color);
    }
}