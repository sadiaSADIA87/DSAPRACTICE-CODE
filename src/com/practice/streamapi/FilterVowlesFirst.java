package com.practice.streamapi;

import java.util.stream.Collectors;

public class FilterVowlesFirst {
     public static  void main(String[] args) {
         String str = "sadia" ;
         String vowels = str.chars().mapToObj(c->String.valueOf((char) c))
                 .filter(ch->"aeiou".contains(ch)).collect(Collectors.joining());
         String constant =  str.chars().mapToObj(c->String.valueOf((char) c))
                 .filter(ch->!"aeiou".contains(ch)).collect(Collectors.joining());

          String result = vowels +constant;
          System.out.println(result);
     }
}
