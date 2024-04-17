class Solution {
    public long count(int coins[], int N, int sum) {
        // code here.
        long[] dp = new long[sum + 1];
        dp[0] = 1; // Base case: there is 1 way to make sum 0 (by not selecting any coin)

        // Fill the dp array
        for (int i : coins) {
            for (int j = i; j <= sum; j++) {
                // For each coin, update the dp array
                // dp[j] represents the number of ways to make the sum j
                // by considering the current coin along with previously considered coins
                dp[j] += dp[j - i];
            }
        }

        // The answer is stored in dp[sum]
        return dp[sum];
    }
}
