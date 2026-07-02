package com.practice.stack;

import java.util.Stack;

public class ValidParanthese {
    public static void main(String[] args) {

        String s = "{[()]}";

        Stack<Character> stack = new Stack<>();

        boolean isValid = true;

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            } else {

                // No opening bracket available
                if (stack.isEmpty()) {

                    isValid = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {

                    isValid = false;
                    break;
                }
            }
        }

        // Extra opening brackets left
        if (!stack.isEmpty()) {
            isValid = false;
        }

        System.out.println(isValid);

    }
}

