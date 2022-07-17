package com.example.demo;

public class Test {

    enum Animals {
        LION, DOG, COW;
    }

    public static void main(String[] args) {
        // ambil semua value enum Animals, tampung ke dalam array
        Animals[] animals = Animals.values();

        // tampilkan value pada index 1
        System.out.println(animals[1]); // DOG
    }
}
