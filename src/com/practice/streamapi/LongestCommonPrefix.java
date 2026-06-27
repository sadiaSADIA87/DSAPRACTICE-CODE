package com.practice.streamapi;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args0) {
        String[] arr = {"abc", "abd", "abf"};
        String first = arr[0];
        String prefix = "";
        for (int i = 1; i <= first.length(); i++) {
            String temp = first.substring(0, i);
            if (Arrays.stream(arr).allMatch(s -> s.startsWith(temp))) {
                prefix = temp;
            } else {
                break;
            }
        }
        System.out.println(prefix);
    }
}
