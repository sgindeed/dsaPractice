class Solution {
    public static void zigZag(int n, int[] arr) {
        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Check if the current index is even
            if (i % 2 == 0) {
                // If the current element is greater than the next, swap them
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                // If the current index is odd
                // If the current element is less than the next, swap them
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    // Helper method to swap elements at index i and j in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
