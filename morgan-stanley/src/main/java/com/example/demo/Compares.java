package com.example.demo;

import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Arrays;
import java.util.Comparator;

public class Compares {

    public static void main(String[] args) {
//        String[] cities = {"Bangalore", "Pune", "San Francisco", "New York City"};
//        MySort ms = new MySort();
//        Arrays.sort(cities, ms);
//        System.out.println(Arrays.binarySearch(cities, "New York City"));
//    }
//
//    // static class harus abstract
//    static abstract class MySort implements Comparator {
//        public int compare(String a, String b) {
//            return b.compareTo(a);
//        }
        int x = 5;
        int y = 0; // pembagian dengan 0 tidak boleh
        int iVal = y!=0 & x/y>0 ?1:0;

        System.out.println(iVal);

    }
}
