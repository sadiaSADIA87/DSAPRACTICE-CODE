package com.practice.hashmap;
import java.util.*;
// to cheeck duplicates , will use hashset and lookup pattern  so conatins() is used.
public class ContainsDuplicate {
    public static  void main (String[] args){
        int [] arr = {1,2,2,3,1,2};
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)) {
                System.out.println(true);
                return;
            }
        set.add(num);
    }
    System.out.println(false);

}
}