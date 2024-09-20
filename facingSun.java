class Solution {
    // Returns count of buildings that can see sunlight
    public int countBuildings(int[] height) {
        // Initialize count for the first building
        int count = 1;
        
        // Keep track of the maximum height seen so far
        int max_height = height[0];
        
        // Loop through the remaining buildings
        for (int i = 1; i < height.length; i++) {
            // If the current building is taller than all previous buildings
            if (height[i] > max_height) {
                count++;
                max_height = height[i]; // Update the maximum height
            }
        }
        
        return count;
    }
}
