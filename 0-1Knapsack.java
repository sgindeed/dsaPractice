class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];
        
        // Building the dp array
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (wt[i-1] <= w) {
                    dp[i][w] = Math.max(dp[i-1][w], dp[i-1][w-wt[i-1]] + val[i-1]);
                } else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        
        // The last cell will have the maximum value that can be obtained
        return dp[n][W];
    }
}
