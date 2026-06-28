package com.practice.array;

public class FindLargestnNumber {
    public static  void  main (String[] args) {
        int [] arr = {1,4,5,7,9};
        int longest = arr[0] ;
        for (int i = 0; i<arr.length ; i++){
            if(arr[i] > longest){
                longest= arr[i];
            }

        }
        System.out.println( "longrs" + longest);
    }
}
