package com.example.demo;

/**
 * Declaring the doThings() method as static would the class thread-safe
 */
public class FindOut extends Thread {
    private static int x;

    public synchronized void doThings() {
        int current = x;
        current++;
        x = current;
    }

    public void run() {
        doThings();
    }

}
