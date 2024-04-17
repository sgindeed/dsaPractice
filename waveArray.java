class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        int temp = 0;
        for(int i=0; i<n-1; i=i+2){
            temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
    }
}
