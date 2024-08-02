
class Solution {
    public int editDistance(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        
        // Create a DP table
        int[][] dp = new int[n + 1][m + 1];
        
        // Initialize the DP table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0) {
                    dp[i][j] = j; // If str1 is empty, the only option is to insert all characters of str2
                } else if (j == 0) {
                    dp[i][j] = i; // If str2 is empty, the only option is to remove all characters of str1
                } else {
                    // If characters are the same, no new edit is needed
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        // Calculate minimum cost of insert, delete, or replace
                        dp[i][j] = 1 + Math.min(dp[i][j - 1], // Insert
                                                Math.min(dp[i - 1][j], // Remove
                                                         dp[i - 1][j - 1])); // Replace
                    }
                }
            }
        }
        
        return dp[n][m];
    }
}