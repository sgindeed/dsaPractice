class Solution {
    public int minIncrements(int[] arr) {
        Arrays.sort(arr);
        int minIncrements = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                int incrementNeeded = arr[i - 1] + 1 - arr[i];
                arr[i] += incrementNeeded;  
                minIncrements += incrementNeeded;  
            }
        }
        
        return minIncrements;
    }
}
