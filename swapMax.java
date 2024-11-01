import java.util.Arrays;

class Solution {
    public long maxSum(Long[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        Long[] rearranged = new Long[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                rearranged[i] = arr[left++];
            } else {
                rearranged[i] = arr[right--];
            }
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(rearranged[i] - rearranged[(i + 1) % n]);
        }
        return sum;
    }
}
