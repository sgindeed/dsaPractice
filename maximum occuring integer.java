class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        // Create an auxiliary array to store the changes
        int[] aux = new int[maxx + 2]; // maxx+2 to handle the range properly

        // Populate the auxiliary array
        for (int i = 0; i < n; i++) {
            aux[l[i]] += 1;   // Increment at the start of the range
            aux[r[i] + 1] -= 1; // Decrement just after the end of the range
        }

        // Compute prefix sums to find the number of ranges each integer is part of
        int maxCount = aux[0];
        int result = 0;
        for (int i = 1; i <= maxx; i++) {
            aux[i] += aux[i - 1]; // Prefix sum computation

            // Find the maximum value and its index
            if (aux[i] > maxCount) {
                maxCount = aux[i];
                result = i;
            }
        }

        return result;
    }
}
