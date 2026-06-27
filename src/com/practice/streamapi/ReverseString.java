package com.practice.streamapi;
import java.util.*;
public class ReverseString {
    public  static  void main (String[] args){
        String original = "java";
        String reverse = Arrays.stream(original.split("")
                )
                .reduce("" , (a,b) -> b+a);
        System.out.println(reverse);
    }
}
