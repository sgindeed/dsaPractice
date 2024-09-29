class Solution {
    int totalCount(int k, int[] arr) {
        int totalCount = 0;
        
        for (int num : arr) {
            // Calculate the number of parts each element needs to be divided into
            totalCount += (num + k - 1) / k;
        }
        
        return totalCount;
    }
}
