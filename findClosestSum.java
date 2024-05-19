class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        // code here
        int low = 0;
        int high = n - 1;

        if (k <= arr[0]) {
            return arr[0];
        }

        if (k >= arr[n - 1]) {
            return arr[n - 1];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                return arr[mid];
            }

            if (k < arr[mid]) {
                high = mid - 1;
            } else { 
                low = mid + 1;
            }
        }

        
        int closest;

        if (low < n && high >= 0) {
            int diffLow = Math.abs(arr[low] - k);
            int diffHigh = Math.abs(arr[high] - k);

            if (diffLow < diffHigh) {
                closest = arr[low];
            } else if (diffLow > diffHigh) {
                closest = arr[high];
            } else {
                closest = Math.max(arr[low], arr[high]);
            }
        } else if (low < n) {
            closest = arr[low];
        } else {
            closest = arr[high];
        }

        return closest;

    }
}
