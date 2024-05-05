class Solution {
    // Function to count inversions in the array.
    static long inversionCount(long arr[], long N) {
        // Initialize the inversion count to 0.
        return mergeSort(arr, 0, (int) (N - 1));
    }

    // Function to perform merge sort and count inversions.
    static long mergeSort(long arr[], int left, int right) {
        long inversionCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            inversionCount += mergeSort(arr, left, mid); // Count inversions in left subarray.
            inversionCount += mergeSort(arr, mid + 1, right); // Count inversions in right subarray.
            inversionCount += merge(arr, left, mid, right); // Merge both subarrays and count inversions.
        }
        return inversionCount;
    }

    // Function to merge two sorted subarrays and count inversions.
    static long merge(long arr[], int left, int mid, int right) {
        long inversionCount = 0;
        int n1 = mid - left + 1;
        int n2 = right - mid;
        long[] L = new long[n1];
        long[] R = new long[n2];

        // Copy data to temp arrays L[] and R[].
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        // Merge the temp arrays back into arr[l..r].
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
                inversionCount += (mid - left + 1) - i; // Count the inversions.
            }
        }

        // Copy the remaining elements of L[], if any.
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // Copy the remaining elements of R[], if any.
        while (j < n2) {
            arr[k++] = R[j++];
        }

        return inversionCount;
    }
}
