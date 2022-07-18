package com.example.demo;

class Vehicle {

    public void drive() {
        System.out.println("Four Wheeler License");
    }
}

class Scooty extends Vehicle {

    public void drive() {
        System.out.println("Two Wheeler License");
    }
}

public class Test13 {
    public static void main(String[] args) {
        Vehicle vehicle = new Scooty();
        vehicle.drive();
    }
}
