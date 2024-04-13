package org.example.class21;

public class CarTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(25000, 22);
        Truck truck = new Truck(35000, 2500);
        System.out.println("Sale price of Sedan: $" + sedan.calculateSalePrice());
        System.out.println("Sale price of Truck: $" + truck.calculateSalePrice());
    }
}

