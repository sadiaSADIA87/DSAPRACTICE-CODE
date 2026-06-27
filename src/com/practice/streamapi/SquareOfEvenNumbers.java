package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//find squARE OF EVEN NUMBERS FROM LIST OF INTEGER.
public class SquareOfEvenNumbers {

     public static  void main (String[] args){
         List<Integer > list = Arrays.asList(2,3,4,5,6,7,8);
         List<Integer> square = list.stream().filter(x-> x % 2 ==0)
                 .map(x-> x*x).collect(Collectors.toList());
         System.out.println(square);
     }
}
