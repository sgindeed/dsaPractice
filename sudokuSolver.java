class Solution
{
    // Function to check if placing num in grid[row][col] is valid.
    static boolean isValid(int grid[][], int row, int col, int num) {
        // Check if num is not repeated in the current row and column.
        for (int x = 0; x < 9; x++) {
            if (grid[row][x] == num || grid[x][col] == num) {
                return false;
            }
        }

        // Check if num is not repeated in the current 3x3 sub-box.
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {
                if (grid[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Function to solve the Sudoku using backtracking.
    static boolean solveSudokuHelper(int grid[][]) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) { // Find an empty cell.
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(grid, row, col, num)) {
                            grid[row][col] = num; // Try num for this cell.

                            if (solveSudokuHelper(grid)) {
                                return true; // Continue solving.
                            }

                            grid[row][col] = 0; // Undo the move (backtrack).
                        }
                    }
                    return false; // No valid number found; need to backtrack.
                }
            }
        }
        return true; // All cells are filled correctly.
    }

    // Function to solve the Sudoku.
    static boolean SolveSudoku(int grid[][]) {
        return solveSudokuHelper(grid);
    }
    
    // Function to print grids of the Sudoku.
    static void printGrid (int grid[][]) {
        for (int r = 0; r < 9; r++) {
            for (int d = 0; d < 9; d++) {
                System.out.print(grid[r][d] + " ");
            }
            System.out.print("\n");

            if ((r + 1) % 3 == 0) {
                System.out.print("");
            }
        }
    }
}
