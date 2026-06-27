package com.practice.hashmap;
import java.util.*;
///grouping +hashmap main method is putIfAbsent()

public class GroupAnagram {
    public static void main(String[] args){
        String [] strs = {"eat" , "tea" ,"tan" , "nat" , "bat", "ate"};
        Map<String ,List<String>> map =new HashMap<>();
        for (String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        System.out.println(map.values());
    }
}
