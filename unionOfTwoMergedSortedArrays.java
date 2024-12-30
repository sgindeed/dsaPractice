class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<a.length; i++)
            list.add(a[i]);
        for(int i=0; i<b.length; i++)
            list.add(b[i]);
        
        for(int i : list){
            if(!set.contains(i))
                set.add(i);
        }
        return set.size();
    }
}
