import java.util.*;

class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // Create a sorted version of the array
        List<Integer> sortedArr = new ArrayList<>(arr);
        Collections.sort(sortedArr);

        // List to store indices where arr and sortedArr differ
        List<Integer> mismatchedIndices = new ArrayList<>();

        // Find indices where the array differs from the sorted version
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.get(i).equals(sortedArr.get(i))) {
                mismatchedIndices.add(i);
            }
        }

        // If there are no mismatches, the array is already sorted
        if (mismatchedIndices.size() == 0) {
            return false; // No swaps needed, so return false
        }

        // If there are exactly two mismatches, check if we can fix them by swapping
        if (mismatchedIndices.size() == 2) {
            int i = mismatchedIndices.get(0);
            int j = mismatchedIndices.get(1);

            // Swap the two mismatched elements in the original array
            Collections.swap(arr, i, j);

            // Check if the array is sorted after the swap
            if (arr.equals(sortedArr)) {
                return true; // The array can be sorted with exactly two swaps
            }
        }

        // If there are more than two mismatches or the swap doesn't sort the array
        return false;
    }
}
