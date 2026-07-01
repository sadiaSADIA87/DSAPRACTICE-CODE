package com.practice.matrix;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {


        public static void main(String[] args) {

            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int top = 0;
            int bottom = matrix.length - 1;

            int left = 0;
            int right = matrix[0].length - 1;

            List<Integer> result = new ArrayList<>();

            while (top <= bottom && left <= right) {

                // Top Row
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;

                // Right Column
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;

                // Bottom Row
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        result.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                // Left Column
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            System.out.println(result);
        }
    }