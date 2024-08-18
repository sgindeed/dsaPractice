class Solution {
    public boolean canSplit(int arr[]) {
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // If the total sum is odd, we cannot split the array into two equal parts
        if (totalSum % 2 != 0) {
            return false;
        }

        // Calculate the target sum which is half of the total sum
        int targetSum = totalSum / 2;
        int prefixSum = 0;

        // Traverse the array and calculate the prefix sum
        for (int num : arr) {
            prefixSum += num;

            // If prefix sum becomes equal to target sum, return true
            if (prefixSum == targetSum) {
                return true;
            }
        }

        // If no such point is found, return false
        return false;
    }
}
