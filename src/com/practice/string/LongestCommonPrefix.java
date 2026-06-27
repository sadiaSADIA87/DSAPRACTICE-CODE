package com.practice.string;
// find the longest common prefix  , patter is used Single traversal
//
//This solution finds the longest common prefix among
// all strings in the array. First, I assume the first string ("flower")
// is the common prefix and store it in the prefix variable.
// Then I iterate through the remaining strings one by one. For each string,
// I check whether it starts with the current prefix using the startsWith() method.
// If it does not start with that prefix, I continuously reduce the prefix by
// removing its last character using substring() until the current string starts with it.
// This process ensures that only the common part shared by all strings remains in
// the prefix variable. After checking all strings, the final value of prefix represents
// the longest common prefix. For the input ["flower", "flow", "flight"],
// the prefix is reduced from "flower" to "flow" and then to "fl", which is common to all strings, so the output is "fl".


public class LongestCommonPrefix {
    public static void main(String[] args){
         String [] strs = { "flower" , "flow" , "flight"};
         String prefix = strs[0];
         for (int i = 1; i<strs.length; i++){
             while (!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);

             }
         }
         System.out.println(prefix);
    }

}
