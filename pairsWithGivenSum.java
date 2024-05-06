class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        
        for (int num : arr) {
            int complement = k - num;
            if (frequencyMap.containsKey(complement)) 
                count += frequencyMap.get(complement);
            if (num == complement)
                count--;
        }
        
        return count/2;
    }
}
