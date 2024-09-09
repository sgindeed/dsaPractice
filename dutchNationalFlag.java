import java.util.ArrayList;

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(ArrayList<Integer> arr) {
        int low = 0;               // Pointer for 0s
        int mid = 0;               // Pointer for current element
        int high = arr.size() - 1; // Pointer for 2s
        
        // Traverse the array
        while (mid <= high) {
            switch (arr.get(mid)) {
                case 0:
                    // Swap arr[low] and arr[mid], increment low and mid
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // Move the mid pointer
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high], decrement high
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    // Helper function to swap elements in the array
    private void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
