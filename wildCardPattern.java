class Solution {
    public int wildCard(String pattern, String str) {
        int m = pattern.length();
        int n = str.length();

        // DP table where dp[i][j] is true if first i characters in pattern 
        // match the first j characters in str
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Empty pattern can match with empty string
        dp[0][0] = true;

        // Only '*' can match with an empty string
        for (int i = 1; i <= m; i++) {
            if (pattern.charAt(i - 1) == '*') {
                dp[i][0] = dp[i - 1][0];
            }
        }

        // Fill the table in bottom-up fashion
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Two cases if we see a '*'
                // a) We ignore '*' character and move to next character in the pattern
                // b) '*' character matches with jth character in str
                if (pattern.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
                // Current characters are considered as matching in two cases
                // (a) current character of pattern is '?' or
                // (b) characters actually match
                else if (pattern.charAt(i - 1) == '?' || pattern.charAt(i - 1) == str.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If characters don't match
                else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[m][n] ? 1 : 0;
    }
}
