package com.practice.twopointer;
//This solution calculates the total amount of rainwater trapped between buildings
//using the Two Pointer approach. I maintain two pointers, left and right,
//starting from both ends of the array. I also keep track of the highest wall
//seen so far from the left (leftMax) and from the right (rightMax). At each step,
//I process the side with the smaller height because the amount of water trapped depends
//on the shorter boundary. If the current height is greater than or equal
//to the maximum height seen on that side, I update the corresponding maximum.
//Otherwise, water can be trapped, and the trapped water is calculated as leftMax - height[left]
//or rightMax - height[right]. I add this trapped water to the total and move
//the corresponding pointer inward. By the time both pointers meet,
//I have calculated the total trapped water. For the input {4,2,0,3,2,5},
//the total trapped water is 9.


public class TrapingRainWater {
    public  static  void main (String[] args) {
        int [] height =  {4,2,0,3,2, 5};
        int left = 0 ;
        int right =height.length-1 ;
        int leftMax = 0;
        int rightMax = 0 ;
        int water = 0 ;
        while(left<right) {
            //left side smaller
            if(height[left] < height[right]) {

            if (height[left] >= leftMax){
                leftMax = height[left];
            }else {
                //water trapeed
                 water+= leftMax -height[left];
            }
             left ++;
            }

            //right side smaller
             else {
                 if(height[right] >= rightMax){
                     rightMax = height[right];
                 }
                 else {
                      water += rightMax -height[right];
                 }
                 right -- ;
            }
        }
        System.out.println(water);
    }

}
