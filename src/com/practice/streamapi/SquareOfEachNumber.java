package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEachNumber {
    public static void  main(String[] args) {
        List<Integer> nums =  Arrays.asList(1,2,3,4,5,6);
         List<Integer> square =nums.stream().map(n->n*n).collect(Collectors.toList());
System.out.println(square);

    }
}
