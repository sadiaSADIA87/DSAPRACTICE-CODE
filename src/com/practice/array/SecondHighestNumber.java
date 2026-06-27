package com.practice.array;
//This solution finds the second highest number in an array using a single traversal.
//I maintain two variables: first to store the largest number seen so far
//and second to store the second largest number. Initially,
//both are set to Integer.MIN_VALUE so that any number in the array can replace them.
//While traversing the array, if the current number is greater than first,
//I move the current first value to second and update first with the current number.
//If the current number is not larger than first but is larger than second and is not equal to first,
//I update second. By the end of the traversal, first contains the largest number and second contains
//the second largest number. For the array {10, 5, 20, 8, 15}, the largest number
//is 20 and the second largest number is 15, so the output is 15.

public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] arr = {10,5, 20,8,15};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num :arr ) {
            if(num >first){
                second=first;
                first=num;
            }else if(num >second && num!=first){
                second=num;
            }
        }
        System.out.println(second);
    }

}
