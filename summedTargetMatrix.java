class Solution {
    static long sumMatrix(long n, long q) {
        // The smallest value in the matrix is 2 (i = 1, j = 1)
        // The largest value in the matrix is 2 * n (i = n, j = n)
        if (q < 2 || q > 2 * n) {
            return 0;
        }

        long start = Math.max(1, q - n);
        long end = Math.min(n, q - 1);

        // Calculate the number of valid (i, j) pairs
        long count = Math.max(0, end - start + 1);
        
        return count;
    }
}
