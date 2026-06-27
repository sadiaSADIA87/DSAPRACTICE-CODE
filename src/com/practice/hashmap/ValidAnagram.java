package com.practice.hashmap;
import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch ,map.getOrDefault(ch,0) +1);
        }
        for (char ch : t.toCharArray()){
            map.put(ch ,map.getOrDefault(ch,0) -1);
        }
        for (int value : map.values()){
            if(value != 0){
                System.out.println(false);
                return;
            }

        }

        System.out.println(true);


    }
}