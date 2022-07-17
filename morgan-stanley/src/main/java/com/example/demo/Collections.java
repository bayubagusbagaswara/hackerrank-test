package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;

public class Collections {

    public static void main(String[] args) {
        // ini kasusnya adalah mengurutkan dengan cara membandingkan
        // karena number2 di compare dengan number1, maka ini diurutkan secara descending
        Comparator<Integer> numberComparator = (number1, number2) -> number2.compareTo(number1);

        Integer[] arr = {1, 4, 3, 2};
        // sort menggunakan comparator
        Arrays.sort(arr, numberComparator);

        // cetak hasil sortingnya
        for (Integer number : arr) {
            System.out.println(number + "");
        }
    }
}
