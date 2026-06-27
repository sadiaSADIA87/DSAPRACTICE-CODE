package com.practice.streamapi;
import  java.util.*;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args){
        List<Integer> nums =  Arrays.asList(1,2,3,4,5,6);
        List<Integer> result = nums.stream().filter(n->n % 2 == 0).collect(Collectors.toList());
 System.out.println(result);
        List<String> list = Arrays.asList("john", "alice", "bob");
        List<String> UPP =    list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(UPP);
        List<String> list1 = Arrays.asList("Java", "Spring", "Boot");
     List<Integer> count =   list1.stream().map(String::length).collect(Collectors.toList());
        System.out.println(count);
        List<String> list2 = Arrays.asList("Java", "Spring", "Microservice");
       List<String> longer5 = list2.stream().filter(n->n.length() > 5).collect(Collectors.toList());
        System.out.println(longer5);
        List<Integer> list4 = Arrays.asList(10,20,30,40);
         Integer sum = list4.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        List<Integer> list5 = Arrays.asList(10,50,30,90,20);
        Integer max = list5.stream().max(Integer::compareTo).get();
        Integer min = list5.stream().min(Integer::compareTo).get();
        System.out.println(min);

        System.out.println(max);



    }
}
