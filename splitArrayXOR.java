class Solution {
    static final int MOD = 1000000007;

    public static int countgroup(int arr[]) {
        int n = arr.length;
        int totalXOR = 0;

        // Step 1: Compute XOR of the whole array
        for (int num : arr) {
            totalXOR ^= num;
        }

        // Step 2: If XOR of the entire array is not 0, no valid partition is possible
        if (totalXOR != 0) {
            return 0;
        }

        // Step 3: Calculate 2^(n-1) % MOD
        long result = 1;
        for (int i = 0; i < n - 1; i++) {
            result = (result * 2) % MOD;
        }

        return (int) result;
    }
}
