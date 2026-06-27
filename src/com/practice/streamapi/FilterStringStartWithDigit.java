package com.practice.streamapi;
 import java.util.*;

public class FilterStringStartWithDigit {
    public static void main(String[] args){
        String [] arr = {"first" , "2nd" , "hello", "4yh"} ;
         Arrays.stream(arr).filter(s-> !s.isEmpty() &&
                 Character.isDigit(s.charAt(0))).forEach(System.out::println);
//if u dont sure der z no empty  string .
        Arrays.stream(arr)
                .filter(s -> Character.isDigit(s.charAt(0)))
                .forEach(System.out::println);

    }

}
