package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoutElment {
    public  static  void main (String[] args) {
         List<String> list = Arrays.asList("a", "b ", " " , " p");
         long count = list.stream().filter(s -> !s.trim().isEmpty())
                .count();
         System.out.println(count);
         //join string
        String result = list.stream().collect(Collectors.joining(","));
        System.out.println(result);
    }
}
