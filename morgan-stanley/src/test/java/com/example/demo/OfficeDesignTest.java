package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class OfficeDesignTest {

    public static int getMaxColors(List<Integer> prices, int money) {
        System.out.println("Money: " + money);
        List<Integer> temp = new ArrayList<>();
        List<Integer> priceSorted = prices.stream().sorted().toList();

        int index = 0;
        int totalPrice = priceSorted.get(index);
        while(totalPrice <= money) {
            totalPrice += priceSorted.get(index+1);
//            System.out.println("Total Prices = " + totalPrice);
//            System.out.println("Price index-" + index + " = " + priceSorted.get(index));
            temp.add(priceSorted.get(index));
            index++;
        }

        for (Integer integer : temp) {
            System.out.println("temp:" + integer);
        }

       return temp.size();

        // index1 + index2 = totalPriceTemp
        // 1 + 1 = 2, lalu cek kondisi apakah <= money, jika iya maka jumlahkan lagi
        // 2 + 1 = 3
        // 3 + 2 = 5
        // 5 + 3 (index4) = False karena 8 > 7
        // lalu hitung jumlah index milik totalPrice
    }

    @Test
    void officeDesign() {

        List<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(10);
        prices.add(5);
        prices.add(1);

        int money = 5;

        int maxColors = getMaxColors(prices, money);
        System.out.println("Total Max color: " + maxColors);

    }
}
