class Solution {
    int rectanglesInCircle(int r) {
        int count = 0;
        int diameterSquared = 4 * r * r; // (2r)^2
        
        // Iterate through all possible lengths and widths
        for (int l = 1; l <= 2 * r; l++) {
            for (int w = 1; w <= 2 * r; w++) {
                if (l * l + w * w <= diameterSquared) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
