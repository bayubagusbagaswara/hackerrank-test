package com.example.demo;

import java.util.*;

public class DistanceMetricTest {

    public static List<Long> getDistanceMetrics(List<Integer> arr) {
        List<Long> output = new ArrayList<>();

        int n = arr.size();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i<n; i++) {
            List<Integer> list = new ArrayList<>(n);
            list.add(i);

            if (map.containsKey(arr.get(i))) {
                list.addAll(map.get(arr.get(i)));
            }
            map.put(arr.get(i), list);
        }

        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int itr: map.get(arr.get(i))) {
                sum += Math.abs(itr - i);
            }
            output.add((long) sum);
        }
        return output;
    }
}
