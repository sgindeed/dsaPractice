class Solution {
    public static int pairsum(int[] arr) {
        // Initialize two variables to store the largest and second largest numbers
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Traverse the array to find the two largest distinct numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                // If current element is greater than max1, update max1 and max2
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                // If current element is greater than max2, update max2
                max2 = arr[i];
            }
        }

        // Return the sum of the two largest distinct numbers
        return max1 + max2;
    }
}
