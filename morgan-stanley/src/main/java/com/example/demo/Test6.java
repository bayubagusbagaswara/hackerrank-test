package com.example.demo;

public class Test6 {
    public static void main(String[] args) {
        // INSERT CODE HERE
        Test6 test6 = new Test6();
        MyInnerClass inner = test6.new MyInnerClass();

//        MyInnerClass inner1 = Test6.new MyInnerClass(); // incorrect
        MyInnerClass innerClass = new Test6().new MyInnerClass();
    }

    private class MyInnerClass {

    }
}
