class Solution {
    static int countMin(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        // Base cases: single character substrings are already palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }

        // Fill the table
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        // The result for the whole string
        return dp[0][n - 1];
    }
}
