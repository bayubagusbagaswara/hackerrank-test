package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test10 {
    private static final Logger log = LoggerFactory.getLogger(Test10.class);
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i=0, j=0; i<5 & j<5; ++i, j = i + 1) {
//            sum += i;
//
//            // apa beda ++i dan i++
//
//            System.out.println("i-"+i);
//            System.out.println("j-"+j);
//            System.out.println(sum);
//        }
//        Object A = new Object();
//        Object B = new Object();
//
//        synchronized (A) {
//            synchronized (B) {
//                synchronized (B) {
//                    System.out.println("Hello World");
//                }
//            }
//        }

    }
    public synchronized void methodA(int i, String msg) {
        log.info(Integer.toString(i));
        log.info(msg);
    }

    public void methodB(int i, String msg) {
        synchronized (this) {
            log.info(Integer.toString(i));
            log.info(msg);
        }
    }
}
