package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TaskQueueTest {

    public static long minTime(List<Integer> batchSize,
                               List<Integer> processingTime,
                               List<Integer> numTasks) {

        int n = batchSize.size(); // 2
        long maxTime = Long.MIN_VALUE;

        for (int i=0; i < n; i++) {

            System.out.println("numTask"+i+"="+numTasks.get(i));
            System.out.println("batchSize"+i+"="+batchSize.get(i));

            // 8 % 3 = 2
            int t = numTasks.get(i) % batchSize.get(i);

            // (8 / 3) + 1
            int temp = (numTasks.get(i) / batchSize.get(i)) + (t==0?0:1);

            System.out.println("t= "+t);
            System.out.println("temp= "+temp);

            maxTime = Math.max(maxTime, (long) temp * processingTime.get(i));
        }
        return maxTime;

        // perulangan index ke 0
        // t = 0, temp = 2, maxTime = 2*6 = 12
        // perulangan index ke 1
        // t = 2, temp = 3, maxTime = 3*5
    }

    @Test
    void taskQueue() {
        List<Integer> batchSize = new ArrayList<>();
        batchSize.add(4);
        batchSize.add(3);

        List<Integer> processingTime = new ArrayList<>();
        processingTime.add(6);
        processingTime.add(5);

        List<Integer> numTask = new ArrayList<>();
        numTask.add(8);
        numTask.add(8);

        long result = minTime(batchSize, processingTime, numTask);
        System.out.println(result);
    }
}
