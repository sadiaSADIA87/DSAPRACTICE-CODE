package com.practice.hashmap;
import java.util.*;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
         int [] arr = {1,1,1 };
         int k = 2;
          Map <Integer,Integer> map = new HashMap<>();
           map.put(0,1)
           ;
           int prefixSum = 0;
           int count = 0;
            for(int num : arr){
                prefixSum += num;
                if(map.containsKey(prefixSum -k)){
                    count += map.get(prefixSum -k);

                }
                map.put(prefixSum,map.getOrDefault(prefixSum,0) +1);
            }
System.out.println(count);
    }
}
