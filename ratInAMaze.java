class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> result = new ArrayList<>();
        
        if (mat[0][0] == 0 || mat[mat.length - 1][mat.length - 1] == 0) {
            return result;
        }
        
        findPaths(mat, 0, 0, "", result);
        return result;
    }
    
    private void findPaths(int[][] mat, int row, int col, String path, ArrayList<String> result) {
        int n = mat.length;
        
        if (row < 0 || col < 0 || row >= n || col >= n || mat[row][col] == 0) {
            return;
        }
        
        if (row == n - 1 && col == n - 1) {
            result.add(path);
            return;
        }
        
        mat[row][col] = 0;
        
        findPaths(mat, row + 1, col, path + "D", result);
        findPaths(mat, row, col + 1, path + "R", result);
        findPaths(mat, row - 1, col, path + "U", result);
        findPaths(mat, row, col - 1, path + "L", result);
        
        mat[row][col] = 1;
    }
}
