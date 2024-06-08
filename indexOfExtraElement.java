class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // Initialize the low and high pointers for binary search
        int low = 0, high = n - 2;

        // Perform binary search to find the extra element
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If elements at the current position are the same, extra element must be after mid
            if (arr1[mid] == arr2[mid]) {
                low = mid + 1;
            } else {
                // If elements are different, extra element must be before or at mid
                high = mid - 1;
            }
        }

        // Return the index of the extra element
        return low;
    }
}
