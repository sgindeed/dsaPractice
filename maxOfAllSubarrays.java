class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxIndex = -1;
        
        // Find maximum in the first window
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        result.add(max);
        
        // Move the window and update maximum
        for (int i = k; i < n; i++) {
            // If maximum is out of the current window, find new maximum
            if (maxIndex < i - k + 1) {
                max = Integer.MIN_VALUE;
                for (int j = i - k + 1; j <= i; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        maxIndex = j;
                    }
                }
            } else {
                // Check if the new element is greater than the current maximum
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }
            result.add(max);
        }
        
        return result;
    }
}
