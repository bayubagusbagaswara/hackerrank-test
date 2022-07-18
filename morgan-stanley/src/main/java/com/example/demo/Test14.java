package com.example.demo;

class Animal {

}
class Dog extends Animal{

}
class Labrador extends Dog {

}


public class Test14 {
    static void printValue(Animal a) {
        System.out.println("ONE");
    }

    static void printValue(Dog b) {
        System.out.println("TWO");
    }

    static void printValue(Object obj) {
        System.out.println("THREE");
    }

    public static void main(String[] args) {
        Labrador c = new Labrador();
        printValue(c); // TWO
        // karena class Labrador itu adalah turunan dari class Dog
        // turunan yang paling dekat
        // Kalau class Object itu adalah class paling atas di Java
    }

}
