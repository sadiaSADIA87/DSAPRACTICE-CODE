package com.practice.binarysearch;

public class FloorElement {
    public static void main(String[] args) {

        int[] arr = {1,2,4,6,10};

        int target = 5;

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while(low <= high){

            int mid = low + (high - low)/2;

            // Possible floor found
            if(arr[mid] <= target){

                ans = arr[mid];

                // Search right for larger floor
                low = mid + 1;
            }
            else{

                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}