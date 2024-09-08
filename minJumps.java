class Solution {
    static int minJumps(int[] arr) {
        int n = arr.length;

        // If array has only one element, we are already at the end
        if (n == 1) return 0;

        // If the first element is 0, we can't move anywhere
        if (arr[0] == 0) return -1;

        // Initialize maximum reachable index, steps, and jumps
        int maxReach = arr[0];  // Max index we can reach
        int steps = arr[0];     // Steps we can still take
        int jumps = 1;          // At least one jump is needed to start

        for (int i = 1; i < n; i++) {
            // If we have reached the end of the array
            if (i == n - 1) return jumps;

            // Update maxReach to see how far we can go from current position
            maxReach = Math.max(maxReach, i + arr[i]);

            // Use a step to move to the next index
            steps--;

            // If no more steps left
            if (steps == 0) {
                // We must jump to continue
                jumps++;

                // If the current index is beyond the max reach, we can't go further
                if (i >= maxReach) return -1;

                // Reinitialize the steps to the amount of steps to reach maxReach
                steps = maxReach - i;
            }
        }

        return -1; // If we exit the loop without reaching the last element
    }
}
