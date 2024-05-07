class Solution {
    int[] repeatingEven(int[] arr, int n) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        for(int i : arr)
            a.add(i);
            
        Set<Integer> Set = new LinkedHashSet<>(a);
        ArrayList<Integer> b = new ArrayList<>();
        for(int i : Set) {
            if(Collections.frequency(a, i) % 2 == 0) {
                b.add(i);
            }
        }
        if(b.size() == 0) {
            b.add(-1);
        }
        int[] ans = new int[b.size()];
        for(int i = 0; i < b.size(); i++) {
            ans[i] = b.get(i);
        }
        Arrays.sort(ans);
        return ans;
    }
}
