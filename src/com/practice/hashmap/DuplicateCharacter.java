package com.practice.hashmap;
import  java.util.*;
public class DuplicateCharacter {
    public static void main(String[] args) {
        String  str = "progamming";
        Set <Character> set = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (char ch : str.toCharArray()){
            if(set.contains(ch)){
                duplicates.add(ch);
            }
            else{
                set.add(ch);
            }
        }
System.out.println(duplicates);
    }
}
