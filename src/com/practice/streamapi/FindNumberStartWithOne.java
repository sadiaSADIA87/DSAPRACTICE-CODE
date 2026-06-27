package com.practice.streamapi;
import java.util.*;

public class FindNumberStartWithOne {
    public static  void main (String[] args){
        List<Integer> list = Arrays.asList(10,15,33, 6,77);
        list.stream().map(String::valueOf).filter(s->s.startsWith("1")).forEach(s->System.out.println(s));
    }
}
