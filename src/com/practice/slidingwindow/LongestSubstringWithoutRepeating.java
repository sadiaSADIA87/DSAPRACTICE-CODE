package com.practice.slidingwindow;

//This solution finds the length of the longest substring without repeating characters
// using the Sliding Window technique. I maintain a window using two pointers,
// left and right, and a HashSet to store the unique characters currently present
//  in the window. The right pointer expands the window by processing one character at a time.
//  If the current character is already present in the set, it means a duplicate has been found,
// so I shrink the window from the left by removing characters until the duplicate is removed.
// Once all characters in the window are unique, I calculate the current window length using
// right - left + 1 and update maxLength if a longer substring is found.
// This continues until the entire string is processed. For the input "abcabcbb",
// the longest substring without repeating characters is "abc", whose length is 3.

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {


    public static void main(String[] args) {
        String s= "abcabcbb";
        Set<Character> set = new HashSet<>();
        int left = 0 ;
        int maxLength= 0 ;
        for (int right = 0; right<s.length();right ++){
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            maxLength = Math.max(maxLength,right-left +1);
        }
        System.out.println(maxLength);
    }
}
