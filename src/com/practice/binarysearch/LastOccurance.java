package com.practice.binarysearch;

public class LastOccurance {

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4,5};

        int target = 2;

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            // Found target
            if(arr[mid] == target){

                ans = mid;

                // Search more on RIGHT side
                low = mid + 1;
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

        System.out.println(ans);
    }
}

