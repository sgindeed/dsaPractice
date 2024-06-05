class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        long sumA = 0, sumB = 0;
        
        // Calculate the sum of both arrays
        for (int i = 0; i < n; i++) {
            sumA += a[i];
        }
        for (int i = 0; i < m; i++) {
            sumB += b[i];
        }
        
        // If the difference between sums is not even, return -1
        if ((sumA - sumB) % 2 != 0) {
            return -1;
        }
        
        // Calculate the target difference
        long target = (sumA - sumB) / 2;
        
        // Use a HashSet to store elements of array b
        HashSet<Long> setB = new HashSet<>();
        for (int i = 0; i < m; i++) {
            setB.add(b[i]);
        }
        
        // Find the pair to swap
        for (int i = 0; i < n; i++) {
            long requiredValue = a[i] - target;
            if (setB.contains(requiredValue)) {
                return 1;
            }
        }
        
        return -1;
    }
}
