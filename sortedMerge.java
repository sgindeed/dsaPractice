class Solution {
    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        
        int i = n - 1, j = 0;
        
        while (i >= 0 && j < m) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            }
            i--;
            j++;
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
