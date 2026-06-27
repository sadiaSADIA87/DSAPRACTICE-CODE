package com.practice.sorting.quicksort;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        // Input array
        int[] arr = {10,7,8,9,1,5};

        // Call quick sort
        quickSort(
                arr,
                0,
                arr.length - 1
        );

        // Final sorted array
        System.out.println(
                Arrays.toString(arr)
        );
    }

    // QUICK SORT METHOD
    static void quickSort(
            int[] arr,
            int low,
            int high){

        // Continue only if valid partition exists
        if(low < high){

            // PARTITION STEP

            // Last element as pivot
            int pivot = arr[high];

            // Tracks smaller elements area
            int i = low - 1;

            // Traverse partition
            for(int j = low;
                j < high;
                j++){

                // If current element smaller than pivot
                if(arr[j] < pivot){

                    i++;

                    // Swap smaller element left
                    int temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }
            }

            // Place pivot correctly
            int temp = arr[i + 1];

            arr[i + 1] = arr[high];

            arr[high] = temp;

            // Pivot final position
            int pivotIndex = i + 1;

            // SORT LEFT SIDE
            quickSort(
                    arr,
                    low,
                    pivotIndex - 1
            );

            // SORT RIGHT SIDE
            quickSort(
                    arr,
                    pivotIndex + 1,
                    high
            );
        }
    }
}