class Solution {
    // Movement directions: Up, Left, Down, Right
    private static final int[][] MOVES = {
        {0, 0}, {-1, 0}, {0, -1}, {1, 0}, {0, 1}
    };
    
    // The keypad layout
    private static final int[][] KEYPAD = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {-1, 0, -1} // -1 represents invalid positions (no button)
    };
    
    public long getCount(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 10; // All single digit numbers (0-9)
        
        long[][] dp = new long[10][n + 1];
        
        // Initialize for single digit numbers
        for (int i = 0; i <= 9; i++) {
            dp[i][1] = 1;
        }
        
        // Fill the dp table for lengths from 2 to n
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= 9; i++) {
                dp[i][len] = 0; // Initialize current cell
                int[] pos = getPosition(i);
                for (int[] move : MOVES) {
                    int newRow = pos[0] + move[0];
                    int newCol = pos[1] + move[1];
                    if (isValid(newRow, newCol)) {
                        int nextDigit = KEYPAD[newRow][newCol];
                        dp[i][len] += dp[nextDigit][len - 1];
                    }
                }
            }
        }
        
        long totalCount = 0;
        for (int i = 0; i <= 9; i++) {
            totalCount += dp[i][n];
        }
        
        return totalCount;
    }
    
    private int[] getPosition(int digit) {
        if (digit == 0) return new int[] {3, 1};
        return new int[] {(digit - 1) / 3, (digit - 1) % 3};
    }
    
    private boolean isValid(int row, int col) {
        return row >= 0 && row < 4 && col >= 0 && col < 3 && KEYPAD[row][col] != -1;
    }
}
