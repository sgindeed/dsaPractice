import java.util.* ;
import java.io.*; 
public class Solution {
	public static long countDistinctWayToClimbStair(int nStairs) {
		// Write your code here.
		int mod = 1000000007;
		if(nStairs == 0 || nStairs == 1)
			return 1;
		
		long[] dp = new long[nStairs + 1];
		dp[0] = 1;
		dp[1] = 1;

		for(int i=2; i<=nStairs; i++){
			dp[i] = (dp[i-1] + dp[i-2]) % mod;
		}

		return dp[nStairs];
	}
}
