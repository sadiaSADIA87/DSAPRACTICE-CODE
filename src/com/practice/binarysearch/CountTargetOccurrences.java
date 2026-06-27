package com.practice.binarysearch;

public class CountTargetOccurrences {

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4};

        int target = 2;

        int first = -1;
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mid = low + (high-low)/2;

            if(arr[mid] == target){

                first = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target){

                low = mid + 1;
            }
            else{

                high = mid - 1;
            }
        }

        int last = -1;
        low = 0;
        high = arr.length - 1;

        while(low <= high){

            int mid = low + (high-low)/2;

            if(arr[mid] == target){

                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target){

                low = mid + 1;
            }
            else{

                high = mid - 1;
            }
        }

        int count = last - first + 1;

        System.out.println(count);
    }


}
