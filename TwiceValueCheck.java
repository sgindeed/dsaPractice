class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int flag = 0;
        for(int i : arr){
            if(set.contains(2*i) || (i % 2 == 0 && set.contains(i/2)))
                flag = 1;
            set.add(i);
        }
        if(flag == 1)
            return true;
        return false;
    }
}
