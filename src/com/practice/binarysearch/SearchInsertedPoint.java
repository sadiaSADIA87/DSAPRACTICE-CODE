package com.practice.binarysearch;

public class SearchInsertedPoint {


    public static void main(String[] args) {

        int[] arr = {1,3,5,6};

        int target = 2;

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mid = low + (high - low)/2;

            if(arr[mid] == target){

                System.out.println(mid);
                return;
            }

            else if(arr[mid] < target){

                low = mid + 1;
            }

            else{

                high = mid - 1;
            }
        }

        // insertion position
        System.out.println(low);
    }
}
