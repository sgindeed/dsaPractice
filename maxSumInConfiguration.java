class Solution {
    long max_sum(int a[], int n) {
        long totalSum = 0;
        long currentSum = 0;

        // Calculate total sum of elements and initial sum
        for (int i = 0; i < n; i++) {
            totalSum += a[i];
            currentSum += i * a[i];
        }

        long maxSum = currentSum;

        // Calculate the new sums for each rotation
        for (int k = 1; k < n; k++) {
            currentSum = currentSum + totalSum - n * a[n - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
