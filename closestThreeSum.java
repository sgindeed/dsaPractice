import java.util.Arrays;

class Solution {
    static int threeSumClosest(int[] array, int target) {
        Arrays.sort(array);
        int n = array.length;
        int closestSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target) ||
                    (Math.abs(currentSum - target) == Math.abs(closestSum - target) && currentSum > closestSum)) {
                    closestSum = currentSum;
                }
                
                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return closestSum;
    }
}
