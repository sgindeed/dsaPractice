class Solution {
    public int findCoverage(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int coverageSum = 0;
        
        // Iterate through the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    // Count ones in left and up directions
                    if (j > 0 && matrix[i][j-1] == 1) { // left
                        coverageSum++;
                    }
                    if (j < cols - 1 && matrix[i][j+1] == 1) { // right
                        coverageSum++;
                    }
                    if (i > 0 && matrix[i-1][j] == 1) { // up
                        coverageSum++;
                    }
                    if (i < rows - 1 && matrix[i+1][j] == 1) { // down
                        coverageSum++;
                    }
                }
            }
        }
        
        return coverageSum;
    }
}
