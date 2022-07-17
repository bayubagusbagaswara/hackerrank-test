package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Soal
 * Kita diberikan List of integer isinya adalah bilangan bulat acak yang diberi nama numbers
 * tugas kita adalah menetukan 2 bilangan terkecil dari list numbers tersebut
 * misal numbers = [6,2,4,10]
 * maka outputnya adalah = [2]
 */
@SpringBootTest
public class ClosestNumbersTest {

    public static void closestNumbers(List<Integer> numbers) {
        int n = numbers.size();
        Collections.sort(numbers);
        int minimumDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n-1; i++) {
            minimumDiff = Math.min(minimumDiff, Math.abs(numbers.get(i)-numbers.get(i+1)));
        }

        for (int i = 0; i<n-1; i++) {
            if (Math.abs(numbers.get(i)-numbers.get(i+1)) == minimumDiff) {

                int n1 = Math.min(numbers.get(i), numbers.get(i+1));
                int n2 = Math.max(numbers.get(i), numbers.get(i+1));

                System.out.print(n1 + " " + n2 + "\n");
            }
        }

//        for (ArrayList<Integer> i : output) {
//            for (int a : i) {
//                System.out.print(a + " ");
//            }
//            System.out.println();
//        }
    }

    @Test
    void closestNumbers() {
        // Soal ini kita disuruh mengurutkan numbers
        // kemudian menampilkan mulai dari nilai terkecil dengan selisih antar number itu sama
        // misal dari dua nomor terkecil itu berselisih 2, maka selanjutnya akan ditampilkan angka dengan selisih 2 juga

        // Intinya harus mencari selisih antar angka yang paling kecil

        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(2);
        numbers.add(4);
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);

        closestNumbers(numbers);
    }
}
