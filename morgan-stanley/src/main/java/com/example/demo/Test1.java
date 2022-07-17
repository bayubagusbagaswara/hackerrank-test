package com.example.demo;

import java.util.HashMap;
import java.util.Map;

class Color {

    private String name;

    public Color(String name) {
        this.name = name;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Map<Color, String> map = new HashMap<>();
        map.put(new Color("Red"), "Red");
        map.put(new Color("Blue"), "Blue");
        map.put(new Color("Green"), "Green");

        System.out.println(map.get(new Color("Blue"))); // null
        // karena get harus key nya, sedangkan kita ketika get malah membuat object baru, jadi object Blue di map berbeda dengan object Blue yang kita instance pada saat memanggil key nya
    }
}
