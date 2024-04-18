class Solution {
    static long sumMatrix(long n, long q) {
        // code here
       long max = n * 2;

        // If q is less than 2 or greater than max, there are no such cells
        if (q < 2 || q > max) {
            return 0;
        }

        // Calculate the range of valid values for i
        long minI = Math.max(1, q - n);
        long maxI = Math.min(n, q - 1);

        // Calculate the count based on the valid range of i
        return maxI - minI + 1;
    }
}
