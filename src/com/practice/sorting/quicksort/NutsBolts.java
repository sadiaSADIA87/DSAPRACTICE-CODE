package com.practice.sorting.quicksort;
import java.util.Arrays;

public class NutsBolts {

    public static void main(String[] args) {

        // Nuts array
        char[] nuts =
                {'@','#','$','%','^','&'};

        // Bolts array
        char[] bolts =
                {'$','%','&','^','@','#'};

        // Start matching
        matchPairs(
                nuts,
                bolts,
                0,
                nuts.length - 1
        );

        // Final matched arrays
        System.out.println(
                Arrays.toString(nuts)
        );

        System.out.println(
                Arrays.toString(bolts)
        );
    }

    // QUICK SORT STYLE MATCHING
    static void matchPairs(
            char[] nuts,
            char[] bolts,
            int low,
            int high){

        // Continue only if valid partition
        if(low < high){

            // Use last bolt as pivot
            char pivot =
                    bolts[high];

            // Partition nuts array
            int pivotIndex =
                    partition(
                            nuts,
                            low,
                            high,
                            pivot
                    );

            // Use matching nut as pivot
            partition(
                    bolts,
                    low,
                    high,
                    nuts[pivotIndex]
            );

            // Left recursion
            matchPairs(
                    nuts,
                    bolts,
                    low,
                    pivotIndex - 1
            );

            // Right recursion
            matchPairs(
                    nuts,
                    bolts,
                    pivotIndex + 1,
                    high
            );
        }
    }

    // PARTITION METHOD
    static int partition(
            char[] arr,
            int low,
            int high,
            char pivot){

        int i = low;

        // Traverse partition
        for(int j = low;
            j < high;
            j++){

            // Smaller than pivot
            if(arr[j] < pivot){

                // Swap smaller left
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }

            // Matching pivot found
            else if(arr[j] == pivot){

                // Move pivot to end
                char temp = arr[j];
                arr[j] = arr[high];
                arr[high] = temp;

                j--;
            }
        }

        // Place pivot correctly
        char temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        // Return pivot position
        return i;
    }
}