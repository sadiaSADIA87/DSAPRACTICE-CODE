package com.practice.streamapi;
import java.awt.*;
import java.util.*;
import java.util.stream.Collectors;

public class CountOccuranceOfword {
    public  static  void main (String[] args){
        String [] arr = { "java" ,"phython" , "sql" , "java" ,"aws"};
        // count only java occurance .
        long count = Arrays.stream(arr).filter(s -> s.equals("java")).count();
        System.out.println(count);

        Map<String, Long> map = Arrays.stream(arr)
                .collect(Collectors.groupingBy(s -> s,Collectors.counting()));
        System.out.println(map);

    }
}
