class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        if (m > n) {
            return kthElement(k, arr2, arr1);
        }

        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while (low <= high) {
            int i = (low + high) / 2;
            int j = k - i;

            int arr1Left = (i == 0) ? Integer.MIN_VALUE : arr1[i - 1];
            int arr1Right = (i == m) ? Integer.MAX_VALUE : arr1[i];
            int arr2Left = (j == 0) ? Integer.MIN_VALUE : arr2[j - 1];
            int arr2Right = (j == n) ? Integer.MAX_VALUE : arr2[j];

            if (arr1Left <= arr2Right && arr2Left <= arr1Right) {
                return Math.max(arr1Left, arr2Left);
            } else if (arr1Left > arr2Right) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }

        throw new IllegalArgumentException("Invalid k");
    }
}
