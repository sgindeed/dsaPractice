class Solution {
    static int minSteps(int d) {
        // Handling the case where the destination is 0
        if (d == 0) {
            return 0;
        }
        
        int position = 0; // Starting position
        int steps = 0; // Number of steps taken
        
        // Keep moving until we reach or exceed the destination
        while (position < d || (position - d) % 2 != 0) {
            steps++;
            position += steps;
        }
        
        return steps;
    }
}
