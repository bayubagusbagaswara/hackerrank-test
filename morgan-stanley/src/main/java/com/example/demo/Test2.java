package com.example.demo;

public class Test2 {

    private static String temp = "1";

    public static void main(String[] args) {
        new Test2().firstMethod();
        System.out.println(temp); // 1, 4 (dari finally secondMethod), 5 (dari catch firstMethod)
    }

    private void firstMethod() {
        try {
            secondMethod(); // ini dilempar error
        } catch (Exception e) {
            temp += 5; // ini yang diambil
        }
    }

    private void secondMethod() throws Exception {
        try {
            thirdMethod();
            temp += 3;
        } catch (Exception e) {
            throw new Exception();
        } finally {
            temp += 4; // ini yang dijalankan
        }
        temp += 5;
    }

    private void thirdMethod() throws Exception {
        throw new Exception();
    }
}
