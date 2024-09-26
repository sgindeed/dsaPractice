class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
       if (arr.length < 2) {
            return 0;
        }

        int count = 0;    // To track current consecutive increasing steps
        int maxCount = 0; // To track the maximum number of consecutive increasing steps

        for (int i = 0; i < arr.length - 1; i++) {
            // If the next building is taller than the current one
            if (arr[i] < arr[i + 1]) {
                count++; // Increment the count of consecutive steps
            } else {
                // If no increase, update the maximum and reset the current count
                maxCount = Math.max(maxCount, count);
                count = 0; // Reset the count
            }
        }

        // After the loop, make sure to check the last sequence
        maxCount = Math.max(maxCount, count);

        return maxCount;
    }

}
