class Solution {
    public static int countWays(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int MOD = 1000000007;
        
        // Create a DP array
        int[][] dp = new int[m + 1][n + 1];
        
        // Initialize dp[0][0] to 1
        dp[0][0] = 1;
        
        // Initialize the first column to 1
        for (int i = 1; i <= m; i++) {
            dp[i][0] = 1;
        }
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
                } else {
                    dp[i][j] = dp[i - 1][j] % MOD;
                }
            }
        }
        
        return dp[m][n];
    }
}
