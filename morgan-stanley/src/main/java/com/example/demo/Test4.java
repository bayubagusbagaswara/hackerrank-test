package com.example.demo;

import java.util.HashMap;
import java.util.Map;

class Color1 {
    private String name;

    public Color1(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class Test4 {
    public static void main(String[] args) {
        Map<Color1, String> map = new HashMap<>();
        map.put(new Color1("Red"), "Red");
        map.put(new Color1("Blue"), "Blue");
        map.put(new Color1("Green"), "Green");

        System.out.println(map.size()); // Object Color cuma 1
        System.out.println(map.get(new Color1("Red")));

        // size Map berukuran 1. Kenapa? karena equals dan hashcode kita kasih nilai true dan 1
        // artinya tiap object itu memiliki hashcode 1 dan equals
        // jadi object lama akan ditimpa oleh object yang terakhir yang dimasukkan kedalam map
    }
}
