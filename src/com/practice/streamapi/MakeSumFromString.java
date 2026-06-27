package com.practice.streamapi;

public class MakeSumFromString {
    public static void main(String[] args) {
        String str = "3[a2[c]]4@$#1";
         int sum = str.chars()
                 .filter(Character::isDigit)
                 .map(Character::getNumericValue)
                 .sum();
        System.out.println(sum);



    }
}