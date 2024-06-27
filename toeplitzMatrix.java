class GfG {
    boolean isToepliz(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                if (mat[row][col] != mat[row + 1][col + 1]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
