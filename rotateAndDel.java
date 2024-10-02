import java.util.ArrayList;

class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int sz = arr.size();
        
        for (int k = 1; k <= sz / 2; k++) {
            // Right-rotate the array by 1 position
            int lastElement = arr.remove(arr.size() - 1);
            arr.add(0, lastElement);
            
            // Delete the (n - k + 1)th element from the beginning
            arr.remove(arr.size() - k);
        }
        
        // Return the first element of the modified array
        return arr.get(0);
    }
}
