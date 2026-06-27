
package com.practice.twopointer;
//This solution performs a left rotation of an array by k positions using the Reversal Algorithm.
//First, I calculate k % arr.length to handle cases where k is greater than the array size.
// Then I reverse the first k elements, reverse the remaining elements, and finally reverse the
// entire array. These three reversals effectively shift all elements to the left by k positions
// while maintaining their relative order. For the input {1,2,3,4,5} and k = 2, the array becomes
//  {3,4,5,1,2}.
// This approach is efficient because it performs the rotation in-place without using any extra array.

import java.util.Arrays;

public class ArrayLeftRotation {
    public static  void main (String[] args) {
        int []  arr = { 1,2,3,4,5} ;
        int k = 2 ;
        k = k% arr.length;
//reverse first k elmnt
        int left = 0 ;
        int right = k-1 ;
        while (left< right){
            int temp = arr[left];
            arr[left] = arr [right];
            arr[right] = temp;
            left ++ ;
            right --;
        }

        //reverse remaining elemnts
        left = k;
        right = arr.length-1 ;
        while (left< right){
            int temp = arr[left];
            arr[left] = arr [right];
            arr[right] = temp;
            left ++ ;
            right --;
        }


        //reverse whole array
        left = 0 ;
        right = arr.length-1;
        while(left< right) {

            int temp = arr[left];
            arr[left] = arr [right];
            arr[right] = temp;
            left ++ ;
            right --;
        }

        System.out.println(Arrays.toString(arr));
    }



}
