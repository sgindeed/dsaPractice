class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0; // Sum for each array
        int maxSum = 0;

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                // Add to sum1 when arr1 has a smaller element
                sum1 += arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                // Add to sum2 when arr2 has a smaller element
                sum2 += arr2.get(j);
                j++;
            } else {
                // Common element found, take the max of both sums and add the common element
                maxSum += Math.max(sum1, sum2) + arr1.get(i);
                // Reset the sums
                sum1 = 0;
                sum2 = 0;
                // Move both pointers forward
                i++;
                j++;
            }
        }

        // Add the remaining elements of arr1 to sum1
        while (i < arr1.size()) {
            sum1 += arr1.get(i);
            i++;
        }

        // Add the remaining elements of arr2 to sum2
        while (j < arr2.size()) {
            sum2 += arr2.get(j);
            j++;
        }

        // Add the maximum of the remaining sums to the maxSum
        maxSum += Math.max(sum1, sum2);

        return maxSum;
    }
}
