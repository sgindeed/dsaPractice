class Solution {
    public long findMaxProduct(List<Integer> arr) {
        // Define the modulo value
        final int MOD = 1000000007;
        
        // Edge case: if the list is empty, return 0 (though the problem implies the list won't be empty)
        if (arr.isEmpty()) {
            return 0;
        }
        
        // Sort the array to handle negative and positive numbers easily
        Collections.sort(arr);
        
        // Variables to keep track of product and other counts
        long maxProduct = 1;
        int negativeCount = 0;
        int zeroCount = 0;
        int largestNegative = Integer.MIN_VALUE;
        boolean hasPositive = false;
        
        for (int num : arr) {
            if (num < 0) {
                negativeCount++;
                largestNegative = Math.max(largestNegative, num);
            } else if (num == 0) {
                zeroCount++;
            } else {
                hasPositive = true;
            }
            
            // For non-zero numbers, include them in the product
            if (num != 0) {
                maxProduct = (maxProduct * num) % MOD;
            }
        }
        
        // If all numbers are zero, return 0
        if (zeroCount == arr.size()) {
            return 0;
        }
        
        // If we have an odd number of negative numbers and no positive numbers,
        // the product of the negatives will be negative, so we need to exclude the smallest negative
        if (negativeCount % 2 != 0) {
            // Exclude the largest negative number if the product contains negatives
            if (negativeCount + zeroCount < arr.size() || hasPositive) {
                maxProduct = (maxProduct * modInverse(largestNegative, MOD)) % MOD;
            } else {
                // If the array contains only negatives and possibly zeros, return the largest negative
                return (maxProduct * modInverse(largestNegative, MOD) + MOD) % MOD;
            }
        }
        
        return (maxProduct + MOD) % MOD;
    }
    
    // Function to calculate the modular inverse of a number under a given modulo
    private long modInverse(long a, int mod) {
        return power(a, mod - 2, mod);
    }
    
    // Function to calculate (base^exp) % mod
    private long power(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
