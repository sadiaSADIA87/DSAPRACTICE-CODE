package com.practice.matrix;

public class RotateMatrix {
     public static  void main (String [] args ){
          int [] [] matrix = { {1,2,3},{4,5,6} ,{7,8,9}};
          int n = matrix.length;
           // transpose
          for(int i= 0 ; i <n ; i ++){
              for(int j= i+1 ;j<n ; j++ ){
                  int temp = matrix[i][j];
                  matrix[i][j] = matrix[j][i];
                  matrix[j][i] = temp ;
              }
          }
          //Reverse every row
         for (int i = 0 ; i<n; i ++){
             int left = 0;
             int right = n-1 ;
              while (left<right){
                  int temp = matrix[i][left];
                  matrix[i][left] = matrix[i][right];
                  matrix[i][right] = temp;
                  left ++;
                  right --;
              }
         }
          for (int i = 0 ; i <n; i++){
              for (int j = 0 ; j<n; j++) {
                  System.out.println(matrix[i][j] +" ");
              }
          }
     }
}
