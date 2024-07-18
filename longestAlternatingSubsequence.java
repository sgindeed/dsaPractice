class Solution {
    public int alternatingMaxLength(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        int n = arr.length;
        int up = 1; // Length of longest alternating subsequence ending with a positive difference
        int down = 1; // Length of longest alternating subsequence ending with a negative difference
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                up = down + 1;
            } else if (arr[i] < arr[i - 1]) {
                down = up + 1;
            }
        }
        
        // The result is the maximum length of the two possible alternating subsequences
        return Math.max(up, down);
    }
}
