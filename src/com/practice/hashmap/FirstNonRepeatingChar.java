package com.practice.hashmap;
import java.util.*;

public class FirstNonRepeatingChar {
     public static void main(String[] args){
    String str = "aabbcdde";
    Map < Character, Integer> map = new HashMap<>();
    for( char ch : str.toCharArray()){
        map.put(ch, map.getOrDefault(ch, 0) +1);
    }
         for( char ch : str.toCharArray()) {
             if(map.get(ch) ==1){
                 System.out.println(ch);
                 return;
             }
         }
         }
}
