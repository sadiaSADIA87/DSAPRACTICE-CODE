package com.practice.streamapi;
import java.util.*;
public class FindMaxMin {
    public  static  void main(String[] args){
        List<Integer> list = Arrays.asList(3, 8 ,6 ,44);
        int max = list.stream().min(Integer::compare).get();
        System.out.println(max);
    }
}
