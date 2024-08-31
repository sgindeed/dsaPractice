import java.util.*;

class Solution {
    // Function to find three numbers such that arr[smaller[i]] < arr[i] < arr[greater[i]]
    public List<Integer> find3Numbers(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return new ArrayList<>(); // No subsequence possible if less than 3 elements
        }

        // Arrays to store the index of the smaller and greater elements
        int[] smaller = new int[n];
        int[] greater = new int[n];
        Arrays.fill(smaller, -1);
        Arrays.fill(greater, -1);

        // Fill the smaller array with the index of the previous smaller element
        int minIndex = 0; // Start with the first element as the smallest
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
            } else {
                smaller[i] = minIndex;
            }
        }

        // Fill the greater array with the index of the next greater element
        int maxIndex = n - 1; // Start with the last element as the greatest
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= arr[maxIndex]) {
                maxIndex = i;
            } else {
                greater[i] = maxIndex;
            }
        }

        // Find the triplet
        for (int i = 0; i < n; i++) {
            if (smaller[i] != -1 && greater[i] != -1) {
                // If both smaller and greater elements exist
                List<Integer> result = new ArrayList<>();
                result.add(arr[smaller[i]]);
                result.add(arr[i]);
                result.add(arr[greater[i]]);
                return result; // Return the triplet
            }
        }

        // No such triplet found
        return new ArrayList<>();
    }
}
