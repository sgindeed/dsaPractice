class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) 
          set.add(num);
        for (int num : b) 
          set.add(num);
        
        TreeSet<Integer> sortedSet = new TreeSet<>(set);
        return new ArrayList<>(sortedSet);
    }
}
