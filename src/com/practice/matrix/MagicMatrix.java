package com.practice.matrix;

public class MagicMatrix {
     public  static void main( String[] argsg) {
         int [] [] matrix = { {1,2,3},{4,5,6} ,{7,8,9}};
         int n = matrix.length;
         int targetSum = 0 ;
          for (int j= 0 ; j<n  ;j ++) {
              targetSum += matrix[0][j];
         }

          boolean isMagic = true;
           // check all rows
          for ( int i = 0 ; i <n ; i ++) {
              int rowSum = 0;
              for (int j = 0; j < n; j++) {
                  rowSum += matrix[i][j];
              }
              if (rowSum != targetSum) {
                  isMagic = false;
                  break;
              }
          }
           // check col
         if (isMagic) {
             for(int j = 0 ; j<n; j++ ) {
                 int colsum = 0;
                 for (int i = 0 ; i <n ; i ++){
                     colsum  += matrix[i][j];
                 }
                  if (colsum != targetSum){
                      isMagic = false;
                       break ;
                  }
             }
         }

         // check digonal
          if (isMagic){
              int digonal1 = 0 ;
               for (int i =0 ; i <n ; i ++) {
                   digonal1 += matrix[i][i];
               }
                if (digonal1 != targetSum ){
                    isMagic = false;
               }
          }
       // Check 2nd digonal
        if (isMagic) {
             int diagonal2 = 0 ;
              for (int i = 0 ; i <n ; i ++) {
                  diagonal2 += matrix[i][n - 1 - i];
              }
              if(diagonal2 != targetSum) {
                  isMagic = false;

              }
                      }
         if(isMagic){
             System.out.println("magic square");
         } else {
             System.out.println("not magic square");
         }


     }
}
