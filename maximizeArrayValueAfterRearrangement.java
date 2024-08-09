class Solution {

    int Maximize(int arr[]) {
        int mod = 1000000007;
        int n = arr.length;
        long sum = 0;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            sum = (sum + (long) arr[i] * i) % mod;
        }

        return (int) sum;
    }
}
