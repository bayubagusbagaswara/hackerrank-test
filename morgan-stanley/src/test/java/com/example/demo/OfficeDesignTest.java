package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

public class OfficeDesignTest {

    public static int getMaxColors(List<Integer> prices, int money) {
        // money = 7
        int sizePrices = prices.size();
        // urutkan dulu prices nya, [1,1,1,2,3,5]
        // lalu jumlah kan isi dalam prices 1 per satu mulai dari index awal, simpa ke variable totalPrice
        // index1 + index2 = totalPriceTemp
        // 1 + 1 = 2, lalu cek kondisi apakah <= money, jika iya maka jumlahkan lagi
        // 2 + 1 = 3
        // 3 + 2 = 5
        // 5 + 3 (index4) = False karena 8 > 7
        // lalu hitung jumlah index milik totalPrice
        return 0;
    }

    @Test
    void officeDesign() {

    }
}
