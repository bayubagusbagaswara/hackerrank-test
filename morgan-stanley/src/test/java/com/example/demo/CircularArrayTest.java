package com.example.demo;

public class CircularArrayTest {

    public static int solution(String[] inputArray, int startPosition, String target) {
        int len = inputArray.length;
        int forwardCount = 0;
        int backwardCount = 0;
        boolean found = false;

        int pos = startPosition;

        if (inputArray[startPosition] == target ) {
            return 0;
        }

        while(!found) {
            pos++;
            if (pos >= len) {
                pos = 0;
            }
            if (inputArray[pos] != target) {
                forwardCount++;
            } else {
                forwardCount++;
                found = true;
            }
        }

        found = false;
        pos = startPosition;
        while (!found) {
            pos--;
            if (pos < 0) {
                pos = len-1;
            }
            if (inputArray[pos] != target) {
                backwardCount++;
            } else {
                backwardCount++;
                found = true;
            }
        }
        return forwardCount > backwardCount ? backwardCount :forwardCount;
    }
}
