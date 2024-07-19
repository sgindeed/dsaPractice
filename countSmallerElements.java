class Solution {
    public int[] constructLowerArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int[] index = new int[n];
        int[] tempIndex = new int[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        mergeSort(arr, ans, index, tempIndex, 0, n - 1);
        return ans;
    }

    private void mergeSort(int[] arr, int[] ans, int[] index, int[] tempIndex, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, ans, index, tempIndex, left, mid);
        mergeSort(arr, ans, index, tempIndex, mid + 1, right);
        merge(arr, ans, index, tempIndex, left, mid, right);
    }

    private void merge(int[] arr, int[] ans, int[] index, int[] tempIndex, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (arr[index[i]] <= arr[index[j]]) {
                tempIndex[k++] = index[i];
                ans[index[i]] += j - (mid + 1);
                i++;
            } else {
                tempIndex[k++] = index[j++];
            }
        }
        while (i <= mid) {
            tempIndex[k++] = index[i];
            ans[index[i]] += j - (mid + 1);
            i++;
        }
        while (j <= right) {
            tempIndex[k++] = index[j++];
        }
        for (i = left; i <= right; i++) {
            index[i] = tempIndex[i];
        }
    }
}
