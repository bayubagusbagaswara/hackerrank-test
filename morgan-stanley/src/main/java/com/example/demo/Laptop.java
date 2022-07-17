package com.example.demo;

public class Laptop {

    public void start() {
        try {
            System.out.print("Starting up ");
            throw new Exception();
        } catch (Exception e) {
            System.out.print("Problem ");
            System.exit(0);
        } finally {
            System.out.print("Shutting down"); // tidak dijalankan, karena sudah exit dari program utama
        }
    }

    public static void main(String[] args) {
        new Laptop().start();

    }
}
