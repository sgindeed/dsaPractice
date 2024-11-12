class Solution {
    static boolean canAttend(int[][] arr) {
        int n = arr.length;
        
        // Perform selection sort to sort intervals based on their start time
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] < arr[minIndex][0]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int[] temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Check for overlap between consecutive intervals
        for (int i = 1; i < n; i++) {
            if (arr[i-1][1] > arr[i][0]) {
                return false;
            }
        }
        return true;
    }
}
