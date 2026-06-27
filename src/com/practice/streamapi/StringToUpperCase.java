package com.practice.streamapi;
import java.util.*;
public class StringToUpperCase {
    public static void main(String[] args){
        List<String> name = Arrays.asList("java" , "spring" , " python");
        name.stream().map(String :: toUpperCase).forEach(s->System.out.println(s));
    }
}
