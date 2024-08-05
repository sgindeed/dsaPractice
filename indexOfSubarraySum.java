class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Initialize the starting and ending pointers of the window
        int start = 0;
        int currentSum = 0;
        
        // Traverse through the array
        for (int end = 0; end < n; end++) {
            // Add the current element to the current sum
            currentSum += arr[end];
            
            // While the current sum is greater than the target sum, shrink the window from the start
            while (currentSum > s && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            
            // If the current sum equals the target sum, return the 1-based indices
            if (currentSum == s) {
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }
        
        // If no subarray is found, return -1
        result.add(-1);
        return result;
    }
}
