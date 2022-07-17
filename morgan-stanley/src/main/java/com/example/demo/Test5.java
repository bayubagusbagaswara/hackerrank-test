package com.example.demo;

/**
 * Test5 adalah Outer class
 * Outer class memiliki abstract method sendMessage
 */
public abstract class Test5 {

    public String recipient;
    public abstract void sendMessage();

    public static void main(String[] args) {
        Test5 m = new Child();
        m.recipient = "1234567890";
        m.sendMessage(); // outer class bisa menggunakan method inner class
    }

    /**
     * Inner class harus mengimplement method sendMessage
     */
    static class Child extends Test5 {
        public final void sendMessage() {
            System.out.println("Text message to " + recipient);
        }
    }
}
