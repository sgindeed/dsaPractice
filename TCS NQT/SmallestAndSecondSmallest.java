import java.util.ArrayList;

class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        // Check if the array has fewer than 2 elements
        if (arr.length < 2) {
            return new int[]{-1};  // Return -1 if second smallest does not exist
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        // Find the smallest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Find the second smallest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min && arr[i] < secMin) {
                secMin = arr[i];
            }
        }

        // Add elements to the result list if both exist
        if (min != Integer.MAX_VALUE) {
            res.add(min);
        }
        if (secMin != Integer.MAX_VALUE) {
            res.add(secMin);
        }

        // If we don't have two elements, return -1
        if (res.size() < 2) {
            return new int[]{-1};
        }

        // Convert the ArrayList to an array
        int result[] = new int[2];
        for (int i = 0; i < 2; i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
