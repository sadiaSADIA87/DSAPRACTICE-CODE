package com.practice.twopointer;

import java.util.Arrays;

public class ArrayRightRotation {
     public static  void main (String[] args) {
         int []  arr = { 1,2,3,4,5} ;
         int k = 2 ;
         k = k% arr.length;

         // reverse whole array
          int left = 0 ;
           int right = arr.length-1 ;
           while (left <right)
           {
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
               left ++ ;
               right -- ;
           }
           //reverse first k elemnts
          left = 0 ;
            right = k-1 ;
            while(left< right) {
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
         System.out.println(Arrays.toString(arr));
         }
     }

