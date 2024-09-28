class Solution {
    public int minimizeCost(int k, int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        
        // Initialize the first stone cost as 0 since that's where Geek starts
        dp[0] = 0;
        
        // Loop through each stone
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            
            // Check all stones Geek can jump to (from i-k to i-1 stones)
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(arr[i] - arr[i - j]));
                }
            }
        }
        
        // Return the minimum cost to reach the last stone
        return dp[n - 1];
    }
}
