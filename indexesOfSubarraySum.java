class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> A = new ArrayList<>();
        int i = 0;
        int j = 0;
        int sum = 0;
        
        while(i < arr.length) {
            if(sum == target) {
                A.add(i+1);
                A.add(j);
                return A;
            } else if(sum < target) {
                if(j < arr.length) {
                    sum += arr[j++];
                } else {
                    break;
                }
            } else {
                sum -= arr[i++];
            }
        }
        
        A.add(-1);
        return A;
    }
}