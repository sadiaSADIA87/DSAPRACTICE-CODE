package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringWithLength {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java" , "Sadia", "Ok","Twt");
        List<String> filterString = list.stream().filter(s->s.length()>3).collect(Collectors.toList());
   System.out.println(filterString);
   //converlist to uppaercase
      List<String> uppercase =   list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercase);

    }
}
