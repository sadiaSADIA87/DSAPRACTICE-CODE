package com.practice.twopointer;

import java.util.Arrays;

public class SquareOfSortedArray {

     public static  void main (String[] args) {
         int [] arr = {-4, -1, 0 ,  3 , 10};
         int left = 0;
         int right = arr.length-1;
         int [] result = new int [arr.length];
         int index = arr.length-1;
         while (left <= right){
             int leftSuare = arr[left] * arr[left];
             int rightSquare = arr[right] *arr[right];
             if(leftSuare > rightSquare){
                 result[index] = leftSuare;
                 left ++;
             }
             else {
                result[index] = rightSquare;
                right -- ;
             }
             index -- ;
         }
         System.out.println(Arrays.toString(result));
     }
}
