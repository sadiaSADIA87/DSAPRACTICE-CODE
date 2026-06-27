package com.practice.twopointer;

import java.util.Arrays;

public class REverseArray {
    public static void main (String[] args) {
        int[] arr = {9, 7, 6, 8};
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
System.out.println(Arrays.toString(arr));
    }
}
