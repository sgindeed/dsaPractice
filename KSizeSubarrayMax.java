import java.util.*;

class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        
        // Process the first k elements of the array
        for (int i = 0; i < k; i++) {
            // Remove elements smaller than the current element from the deque
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.removeLast();
            }
            // Add the current element at the end of the deque
            deque.addLast(i);
        }
        
        // Process the rest of the elements
        for (int i = k; i < arr.length; i++) {
            // The front of the deque is the largest element of the previous window
            result.add(arr[deque.peekFirst()]);
            
            // Remove the elements that are out of this window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            
            // Remove elements smaller than the current element from the deque
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.removeLast();
            }
            
            // Add the current element at the end of the deque
            deque.addLast(i);
        }
        
        // Add the maximum of the last window
        result.add(arr[deque.peekFirst()]);
        
        return result;
    }
}
