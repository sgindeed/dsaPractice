class Solution {
    long max_Books(int arr[], int n, int k) {
        long maxBooks = 0;
        long currentSum = 0;
        
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (arr[right] > k) {
                // If current stack height exceeds k, reset the window
                left = right + 1;
                currentSum = 0;
            } else {
                // Add the current stack height to the current sum
                currentSum += arr[right];
                // Update the maximum books collected
                maxBooks = Math.max(maxBooks, currentSum);
            }
        }
        
        return maxBooks;
    }
}
