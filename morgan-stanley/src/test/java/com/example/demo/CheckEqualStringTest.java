package com.example.demo;

import org.junit.jupiter.api.Test;

public class CheckEqualStringTest {

    @Test
    void testString() {
        String s1 = "Hello ";
        s1 += "World";
        String s2 = "Hello";
        s2 += " ";
        s2 += "World";
        String s3 = s1.intern();
        String s4 = s2.intern();
        boolean b1 = s3 == s4;
        boolean b2 = s3.equals(s4);

        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);

        System.out.println("b1: " + b1); // true
        System.out.println("b2: " + b2); // true

        // Kenapa true? karena kita pake intern, didalam intern itu berbentuk object
        // Jadi sebenarnya, ada satu object String Hello World
        boolean b3 = s1 == s2;
        System.out.println("S1 & S2: " + b3); // false, karena letak memory nya berbeda
    }

}
