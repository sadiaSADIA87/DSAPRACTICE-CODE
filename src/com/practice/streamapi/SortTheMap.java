package com.practice.streamapi;

import java.util.HashMap;
import java.util.Map;

public class SortTheMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("ABC", 20);

        map.put("BAA", 10);

        map.put("CC", 40);

        map.put("DDD", 5);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}
