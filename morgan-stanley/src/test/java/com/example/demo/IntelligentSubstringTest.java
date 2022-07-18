package com.example.demo;

public class IntelligentSubstringTest {

    public static int getSpecialSubstring(String s, int k, String charValue) {
        // Write your code here
        int n = s.length();

        if (k == 0) {
            return 0;
        }
        int count = 0;
        int left = 0;
        int right = 0;
        int result = 0;

        while (right<n) {
            while (right<n && count <= k) {
                int pos = s.charAt(right) - 'a';
                if (charValue.charAt(pos) == '0') {
                    if (count + 1 > k) {
                        break;
                    } else {
                        count++;
                    }
                }
                right++;
                if (count<=k) {
                    result = Math.max(result, right-left);
                }
            }
            while (left<right) {
                int pos = s.charAt(left) - 'a';
                left++;
                if (charValue.charAt(pos) == '0') {
                    count--;
                }
                if (count<k) {
                    break;
                }
            }
        }
        return result;
    }
}
