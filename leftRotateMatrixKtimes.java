class Solution {
    public int[][] rotateMatrix(int k, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        // Reduce k to a value between 0 and 3, since rotating 4 times returns to original
        k = k % 4;
        
        // Function to rotate the matrix 90 degrees clockwise
        for (int i = 0; i < (3 * k) % 4; i++) {
            mat = rotate90Clockwise(mat, n, m);
            // Update dimensions after each rotation
            int temp = n;
            n = m;
            m = temp;
        }
        
        return mat;
    }
    
    private int[][] rotate90Clockwise(int[][] mat, int n, int m) {
        int[][] newMat = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newMat[j][n - 1 - i] = mat[i][j];
            }
        }
        return newMat;
    }
}
