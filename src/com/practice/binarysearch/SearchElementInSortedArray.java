package com.practice.binarysearch;

public class SearchElementInSortedArray {

    public static void main (String[] args) {


        // Sorted array
        int[] arr = {1,3,5,7,9,11};

        // Element to search
        int target = 7;

        // Start index
        int low = 0;

        // End index
        int high = arr.length - 1;

        while(low <= high){

            // Find middle element
            int mid = low + (high - low) / 2;

            // Target found
            if(arr[mid] == target){

                System.out.println(
                        "Found at index : " + mid
                );

                return;
            }

            // Search right half
            else if(arr[mid] < target){

                low = mid + 1;
            }

            // Search left half
            else{

                high = mid - 1;
            }
        }

        System.out.println(-1);
    }
}
