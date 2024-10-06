class Solution {
    // Directions for 8-connected components (up, down, left, right and 4 diagonals)
    private final int[] rowDir = {-1, -1, -1, 0, 0, 1, 1, 1};
    private final int[] colDir = {-1, 0, 1, -1, 1, -1, 0, 1};
    
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Edge case: empty grid
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int n = grid.length; // number of rows
        int m = grid[0].length; // number of columns

        // Traverse the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If we find land ('1'), it's part of a new island
                if (grid[i][j] == '1') {
                    // Perform DFS to mark the entire island
                    dfs(grid, i, j, n, m);
                    // Increment island count
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    // DFS function to mark all land cells of the current island
    private void dfs(char[][] grid, int row, int col, int n, int m) {
        // Base case: If the cell is out of bounds or it's water ('0')
        if (row < 0 || row >= n || col < 0 || col >= m || grid[row][col] == '0') {
            return;
        }

        // Mark the current cell as visited by setting it to '0' (water)
        grid[row][col] = '0';

        // Explore all 8 possible directions
        for (int i = 0; i < 8; i++) {
            dfs(grid, row + rowDir[i], col + colDir[i], n, m);
        }
    }
}
