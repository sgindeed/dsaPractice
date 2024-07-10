class Solution {
    static int maxSquare(int n, int m, int mat[][]) {
        // Create a 2D dp array to store the size of the largest square sub-matrix
        int[][] dp = new int[n][m];
        int maxSideLength = 0;

        // Initialize the dp array and find the maximum side length
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Copy the first row and first column as it is
                if (i == 0 || j == 0) {
                    dp[i][j] = mat[i][j];
                } else if (mat[i][j] == 1) {
                    // If mat[i][j] is 1, calculate the size of the largest square sub-matrix ending at (i, j)
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
                }
                
                // Update the maximum side length
                if (dp[i][j] > maxSideLength) {
                    maxSideLength = dp[i][j];
                }
            }
        }

        return maxSideLength;
    }
}
