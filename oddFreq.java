class Solution {
    int getSingle(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr)
            map.put(i, map.getOrDefault(i, 0)+1);
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() % 2 != 0)
                return entry.getKey();
        }
        return -1;
    }
}
