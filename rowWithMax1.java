class Solution {
    public int rowWithMax1s(int arr[][]) {
        int maxRowIndex = -1; // Index of the row with the maximum number of 1s
        int max1sCount = 0;   // Maximum number of 1s found
        
        // Iterate over each row
        for (int i = 0; i < arr.length; i++) {
            // Count number of 1s in the current row
            int current1sCount = count1s(arr[i]);
            // Update the max1sCount and maxRowIndex if current row has more 1s
            if (current1sCount > max1sCount) {
                max1sCount = current1sCount;
                maxRowIndex = i;
            }
        }
        
        return maxRowIndex;
    }
    
    // Helper method to count the number of 1s in a sorted row
    private int count1s(int[] row) {
        int low = 0;
        int high = row.length - 1;
        
        // Perform binary search to find the first occurrence of 1
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == 1) {
                high = mid - 1; // Look in the left half
            } else {
                low = mid + 1; // Look in the right half
            }
        }
        
        // All 1s will be from the first occurrence to the end of the row
        return row.length - low;
    }
}
