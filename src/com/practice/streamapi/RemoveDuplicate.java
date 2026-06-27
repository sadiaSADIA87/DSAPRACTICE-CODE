package com.practice.streamapi;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1 ,2, 3,2,4,5,2,2,5,5);
        list.stream().distinct().forEach(n-> System.out.println(n));
    }

}
