package com.practice.stack;

import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        // Push 5
        stack.push(5);

        if (minStack.isEmpty())
            minStack.push(5);
        else
            minStack.push(Math.min(5, minStack.peek()));

        // Push 3
        stack.push(3);
        minStack.push(Math.min(3, minStack.peek()));

        // Push 7
        stack.push(7);
        minStack.push(Math.min(7, minStack.peek()));

        // Push 2
        stack.push(2);
        minStack.push(Math.min(2, minStack.peek()));

        System.out.println("Minimum = " + minStack.peek());

        // Pop
        stack.pop();
        minStack.pop();

        System.out.println("Minimum after Pop = " + minStack.peek());

        System.out.println("Top Element = " + stack.peek());

    }
}



