class Solution {
    public static long[] productExceptSelf(int nums[]) {
        int n = nums.length;
        long[] result = new long[n];
        
        // Initialize the result array as 1
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }

        // Compute products of elements before the current index
        long prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        // Compute products of elements after the current index
        long suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
}
