package com.practice.hashmap;
import java.util.*;
// top 2 frequent elments  hashmap_priorityQueue
//priority queue is used for highest , lowest , top k .normally  smallest elemnt comes first  but here e do  custom sorting on line (a,b) -> map.get(b) -map.get(a)
// hashMAp -> to count frequency
// priorityQueue = get highest Frequency;
public class TopKFrequentElemnt {
    public static void main(String[] args) {
        int [] arr = {1,1,1, 2,2,3};
        int k = 2;
        Map <Integer,Integer> map = new HashMap<>();
         for (int num : arr){
             map.put(num , map.getOrDefault(num , 0)+1);
         }
           PriorityQueue <Integer> pq = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
            pq.addAll(map.keySet());
        for(int i =0 ; i <k ; i++){
        System.out.println(pq.poll());
}
    }
}
