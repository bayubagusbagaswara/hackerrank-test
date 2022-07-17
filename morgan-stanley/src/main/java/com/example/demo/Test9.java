package com.example.demo;

interface Calculator {
    void cal(int item);
}

class DisplayA implements Calculator {

    int x;

    @Override
    public void cal(int item) {
        x = item * item;
    }
}

class DisplayB implements Calculator {
    int x;

    @Override
    public void cal(int item) {
        x = item / item;
    }
}

public class Test9 {
    public static void main(String[] args) {
        DisplayA arr1 = new DisplayA();
        DisplayB arr2 = new DisplayB();

        arr1.x = 0;
        arr2.x = 0;

        arr1.cal(2); // 2 dikali 2 = 4
        arr2.cal(2); // 2 dibagi 2 = 1

        System.out.print(arr1.x + " " + arr2.x); // 4 1
    }
}
