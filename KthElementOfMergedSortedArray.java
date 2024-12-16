class Solution {
    public int kthElement(int a[], int b[], int k) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                k--;
                if (k == 0) return a[i];
                i++;
            } else {
                k--;
                if (k == 0) return b[j];
                j++;
            }
        }
        while (i < a.length) {
            k--;
            if (k == 0) return a[i];
            i++;
        }
        while (j < b.length) {
            k--;
            if (k == 0) return b[j];
            j++;
        }
        return -1;
    }
}
