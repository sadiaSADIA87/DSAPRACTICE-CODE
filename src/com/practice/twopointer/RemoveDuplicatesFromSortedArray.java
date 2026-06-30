package com.practice.twopointer;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        int left = 0;
        for (int right = 1; right < arr.length; right++) {
            if (arr[right] != arr[left]) {
                left++;
                arr[left] = arr[right];
            }
        }
    int newLength = left +1 ;
    for (int k = 0 ; k<newLength ; k++){
    System.out.println(arr[k] + " ");
}
    }
}