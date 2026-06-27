package com.practice.array;
//This solution uses Kadane's Algorithm to find the maximum subarray sum in a single traversal.
//I maintain two variables: currentSum and maxSum.
//currentSum represents the maximum subarray sum ending at the current index,
// while maxSum stores the overall maximum sum found so far.
//For each element, I decide whether to start a new subarray
//from the current element or extend the existing subarray by adding
//the current element to currentSum. This decision is made
//using Math.max(nums[i], currentSum + nums[i]). After updating currentSum,
//I compare it with maxSum and update maxSum if a larger sum is found.
//By the end of the traversal, maxSum contains the maximum sum of any contiguous subarray.
//For the input {-2,1,-3,4,-1,2,1,-5,4},
//the maximum subarray is {4,-1,2,1} whose sum is 6.




public class MaxSubArraySum {

    public  static  void main (String[] args) {
         int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
         int currentSum = nums[0];
         int maxSum = nums[0];
         for(int i = 1 ; i <nums.length;i ++){
             currentSum = Math.max(nums[i] , currentSum+nums[i]);
             maxSum = Math.max(maxSum,currentSum);
         }
         System.out.println(maxSum);
    }
}
