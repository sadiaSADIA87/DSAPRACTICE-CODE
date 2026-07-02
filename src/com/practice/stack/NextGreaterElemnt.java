package com.practice.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElemnt {
    public static void main(String[] args) {

        int[] nums = {4, 5, 2, 10};

        int n = nums.length;

        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push current element
            stack.push(nums[i]);
        }

        System.out.println(Arrays.toString(result));
    }
}
