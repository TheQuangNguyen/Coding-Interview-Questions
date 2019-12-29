package Leetcode.Easy.Medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {

    // Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

    // Input:
    //[
    //  [0,1,2,0],
    //  [3,4,5,2],
    //  [1,3,1,5]
    //]
    // Output:
    //[
    //  [0,0,0,0],
    //  [0,4,5,0],
    //  [0,3,1,0]
    //]

    public void setZeroes(int[][] matrix) {
        Set<Integer> rowsThatNeedToSetToZeroes = new HashSet<>();
        Set<Integer> columnsThatNeedToSetToZeroes = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsThatNeedToSetToZeroes.add(i);
                    columnsThatNeedToSetToZeroes.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rowsThatNeedToSetToZeroes.contains(i) || columnsThatNeedToSetToZeroes.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


    // Runtime: 7 ms, faster than 5.57%
    // Memory Usage: 47.8 MB, less than 44.28%

    // Time complexity is O(m x n)
    // Space complexity is O(M x N) where M is the number of rows that contain zeroes and N is the number of columns that contain zeroes
}
