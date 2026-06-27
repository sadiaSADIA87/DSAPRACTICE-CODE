package com.practice.hashmap;
import java.util.*;

// two sum problem / find two numbers whose sum equals target .
// pattern is HashMap+ single traversal  , time complexcity is O(n)

public class TwoSum {
     public static  void  main (String[] args) {
         int[] arr = {2, 7, 11, 9};

         int target = 9;
         Map<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < arr.length; i++) {
              int diff = target- arr[i];
              if(map.containsKey(diff)){
                  System.out.println(map.get(diff) + " " + i);
                  return;
              }
              map.put(arr[i] ,i);

         }
     }
}
