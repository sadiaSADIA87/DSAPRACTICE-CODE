package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PalindromFromStringList {

    public static void main (String[] args) {
        List<String> words = Arrays.asList("madam","banana" ,"hii");
         boolean palindromPresent = words.stream()
                 .anyMatch(word-> IntStream.range(0,word.length()/2)
                   .allMatch(i->word.charAt(i)== word.charAt(word.length() -1 -i)));
         System.out.println(palindromPresent);

         // also print the word which is plindrom.
        words.stream().filter(word->IntStream.range(0,word.length()/2)
                .allMatch(i-> word.charAt(i) == word.charAt(word.length() -1 -i)))
                .forEach(System.out::println);

    }
}
