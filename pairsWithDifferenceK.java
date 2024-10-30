import java.util.HashMap;

class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (k == 0) {
                int freq = map.get(num);
                count += (freq * (freq - 1)) / 2;
            } else {
                if (map.containsKey(num + k)) count += map.get(num) * map.get(num + k);
            }
        }
        
        return count;
    }
}
