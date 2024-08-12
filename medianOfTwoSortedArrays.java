class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m1 = -1, m2 = -1;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            m2 = m1;
            if (i != n && (j == n || arr1[i] <= arr2[j])) {
                m1 = arr1[i];
                i++;
            } else {
                m1 = arr2[j];
                j++;
            }
        }
        return m1 + m2;
    }
}
