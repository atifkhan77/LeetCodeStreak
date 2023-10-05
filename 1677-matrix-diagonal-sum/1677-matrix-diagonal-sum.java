class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length; // Get the size of the square matrix
        int diagonalSum = 0; // Initialize the sum of diagonals

        for (int i = 0; i < n; i++) {
            diagonalSum += mat[i][i]; // Add elements from the primary diagonal
            diagonalSum += mat[i][n - 1 - i]; // Add elements from the secondary diagonal
        }

        // If the matrix size is odd, subtract the duplicate element at the center
        if (n % 2 == 1) {
            int middleElement = mat[n / 2][n / 2];
            diagonalSum -= middleElement;
        }

        return diagonalSum;
    }
}