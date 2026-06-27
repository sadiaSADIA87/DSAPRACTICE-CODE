package com.practice.streamapi;
import java.util.*;
public class FindDuplicate {
    public static void  main(String[] args){
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5,6,7);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(n -> !set.add(n)).forEach(System.out::println);

    }

}
