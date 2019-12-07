public class RotateImage {

    // You are given an n x n 2D matrix representing an image
    // Rotate the image by 90 degrees clockwise
    // You have to rotate the image in-place

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int start = 0;
        int end = matrix.length - 1;

        // reverse matrix horizontally
        while (start < end) {
            int[] temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++;
            end--;
        }

        // swap entries in matrix diagonally
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Time complexity is approximately n^2/2 because you have to go through about half the matrix to swap it diagonally
    // Space complexity is O(1) since we just use two temp variables that store constant amount of integers

    // Runtime: 0 ms, faster than 100.00% of Java online submissions
    // Memory Usage: 35.9 MB, less than 100.00% of Java online submissions
}
