package com.practice.stack;

import java.util.Stack;

public class RemoveStarFromString {
    public static void main(String[] args) {

        String s = "leet**code";

        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (char ch : s.toCharArray()) {

            // If character is '*', remove previous character
            if (ch == '*') {

                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else {

                stack.push(ch);

            }
        }

        // Build the final string
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Characters come out in reverse order, so reverse them
        result.reverse();

        System.out.println(result.toString());


}
}
