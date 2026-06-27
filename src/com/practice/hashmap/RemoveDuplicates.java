package com.practice.hashmap;

import java.util.HashSet;

public class RemoveDuplicates {
    public  static  void main (String[] args){
        int [] arr = {4,2,7,2,9,4,1};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);

        }
        System.out.println(set);
    }
}
