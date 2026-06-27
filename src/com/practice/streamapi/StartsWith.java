package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
     public static  void main(String[] args) {
         List<String > list = Arrays.asList("apple","apricot" ,"banama","mango");
        List<String> startsWith =   list.stream().filter(n->n.startsWith("a")).collect(Collectors.toList());
    System.out.println(startsWith);
     }
}
