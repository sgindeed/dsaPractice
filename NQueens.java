import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        // Start solving by trying to place queens one by one
        solveNQueens(result, current, n);
        return result;
    }

    // Helper function to place queens column by column
    private void solveNQueens(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> current, int n) {
        // If all queens are placed, add the solution to the result
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try placing a queen in each row of the current column
        for (int row = 1; row <= n; row++) {
            if (isSafe(current, row)) {
                current.add(row); // Place the queen
                solveNQueens(result, current, n); // Recur to place the rest
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }

    // Helper function to check if placing the queen is safe
    private boolean isSafe(ArrayList<Integer> current, int row) {
        int currentColumn = current.size(); // Column number where the new queen is to be placed

        // Check for conflicts with already placed queens
        for (int col = 0; col < current.size(); col++) {
            int placedRow = current.get(col);

            // Check if the row is already taken or queens are in the diagonal
            if (placedRow == row || Math.abs(placedRow - row) == Math.abs(col - currentColumn)) {
                return false;
            }
        }
        return true;
    }
}
