package com.example.demo;

import org.junit.jupiter.api.Test;


public class AnagramsTest {

    public static int getAnagram(String s) {
        int len = s.length();
        int count = 0;

        for (int i=0, j=len/2; i<len/2 && j<len; i++, j++) {

            if (s.charAt(i) != s.charAt(j)) {
                count++;
            }
        }
        return count;
    }

    @Test
    void anagram() {

    }
}
