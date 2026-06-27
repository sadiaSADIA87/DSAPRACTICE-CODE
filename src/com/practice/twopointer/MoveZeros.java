package com.practice.twopointer;
//This solution moves all zeros to the end of the array while maintaining
// the relative order of non-zero elements using the Two Pointer approach.
// I use two pointers: fast and slow. The fast pointer traverses the entire array,
// while the slow pointer keeps track of the position where the next non-zero element
// should be placed. Whenever fast encounters a non-zero element,
//  I swap it with the element at the slow index and increment slow.
// This ensures that all non-zero elements are moved to the front of
// the array in their original order, while zeros automatically shift toward the end.
// For the
// input {0,1,0,4,12}, the output becomes {1,4,12,0,0}.

import java.util.Arrays;

public class MoveZeros {
    public static  void main (String[] args){
         //input arry
        int [] arr = { 0,1,0,4,12,};
        int slow = 0 ;
        for(int fast = 0 ; fast <arr.length; fast++){
            if(arr[fast] != 0){
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
        }
        System.out.println(Arrays.toString(arr));

        /// without third varible
        int index = 0 ;
         for(int i = 0 ; i <arr.length; i ++){
             if(arr[i] != 0){
                 arr[index++] = arr[i];
             }
         }
         while (index< arr.length){
             arr[index++] = 0 ;
         }
       System.out.println("After " + Arrays.toString(arr));
    }
}
