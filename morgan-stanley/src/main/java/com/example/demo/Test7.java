package com.example.demo;

class myThread implements Runnable {
    @Override
    public void run() {
        Test7.obj.notify();
    }
}
public class Test7 implements Runnable {

    public static Test7 obj;
    private int data;

    public Test7() {
        data = 10;
    }

    @Override
    public void run() {

        try {
            obj = new Test7();
            obj.wait();
            obj.data += 20;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Test7());
        Thread thread2 = new Thread(new myThread());

        thread1.start();
        thread2.start();

        System.out.println(" DRM - ");
    }
}
