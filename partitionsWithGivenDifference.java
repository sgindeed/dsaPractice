class Solution {
    public static int countPartitions(int n, int d, int[] arr) {
        final int MOD = 1000000007;
        int totalSum = 0;
        
        for (int num : arr) {
            totalSum += num;
        }
        
        if ((totalSum + d) % 2 != 0) {
            return 0;
        }
        
        int S1 = (totalSum + d) / 2;
        
        int[] dp = new int[S1 + 1];
        dp[0] = 1;
        
        for (int num : arr) {
            for (int j = S1; j >= num; j--) {
                dp[j] = (dp[j] + dp[j - num]) % MOD;
            }
        }
        
        return dp[S1];
    }
}
