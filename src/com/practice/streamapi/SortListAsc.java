package com.practice.streamapi;
import java.util.*;

public class SortListAsc {
    public  static  void main(String[] args){
        List<Integer> list = Arrays.asList(3,5,77,8);
        //Ascending order
        list.stream().sorted().forEach(s->System.out.println(s));
        //descending order
        list.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
    }
}
