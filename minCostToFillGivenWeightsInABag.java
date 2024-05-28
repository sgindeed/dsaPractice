class Solution {
    public static int minimumCost(int n, int w, int[] cost) {
        // Initialize the dp array with a large value
        int[] dp = new int[w + 1];
        for (int i = 0; i <= w; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Base case: cost to buy 0 kg of oranges is 0
        dp[0] = 0;

        // Fill the dp array
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= n; j++) {
                // Check if j kg packet is available and we can form i kg by using it
                if (j <= i && cost[j - 1] != -1 && dp[i - j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - j] + cost[j - 1]);
                }
            }
        }

        // If dp[w] is still Integer.MAX_VALUE, it means we can't form w kg
        return dp[w] == Integer.MAX_VALUE ? -1 : dp[w];
    }
}
