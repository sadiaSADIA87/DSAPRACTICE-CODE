package com.practice.twopointer;
//This solution finds the maximum amount of water that can be contained between
//two lines using the Two Pointer approach. I place one pointer at the beginning
//of the array (left) and another at the end (right). The width of the container
//is the distance between the pointers, and the height is determined by the smaller
//of the two lines because water cannot exceed the shorter boundary. I calculate the
//area as width * minHeight and keep track of the maximum area found so far.
//After calculating the area, I move the pointer pointing to the smaller height inward
//because moving the taller line cannot increase the area if the shorter line remains
//the limiting factor. This process continues until both pointers meet.
//For the input {1,8,6,2,5,4,8,3,7}, the maximum area obtained is 49.

public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            if (area > maxArea) {
                maxArea = area;

            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;

            }
        }
        System.out.println(maxArea);

    }
}