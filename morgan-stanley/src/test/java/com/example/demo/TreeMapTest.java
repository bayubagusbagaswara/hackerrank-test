package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    @Test
    void treeMap() {
        // TreeMap otomatis akan diurutkan sesuai key nya
        Map<Integer, Object> sampleMap = new TreeMap<Integer, Object>();
        sampleMap.put(1, null);
        sampleMap.put(5, null);
        sampleMap.put(3, null);
        sampleMap.put(2, null);
        sampleMap.put(4, null);

        System.out.println(sampleMap);
    }
}
