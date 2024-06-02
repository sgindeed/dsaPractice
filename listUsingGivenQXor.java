class Solution {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        // code here
        ArrayList<Integer> s = new ArrayList<>();
        s.add(0);
        
        int currentXOR = 0;
        
        for (int i = 0; i < q; i++) {
            int type = queries[i][0];
            int x = queries[i][1];
            
            if (type == 0) {
                s.add(x ^ currentXOR);
            } else if (type == 1) {
                currentXOR ^= x;
            }
        }
        
        for (int i = 0; i < s.size(); i++) {
            s.set(i, s.get(i) ^ currentXOR);
        }
        
        Collections.sort(s);
        
        return s;
    }
}
