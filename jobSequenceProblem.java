import java.util.Arrays;

class Solution
{
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].deadline > maxDeadline) {
                maxDeadline = arr[i].deadline;
            }
        }
        boolean[] slots = new boolean[maxDeadline + 1];
        int countJobs = 0, maxProfit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {
                if (!slots[j]) {
                    slots[j] = true;
                    countJobs++;
                    maxProfit += arr[i].profit;
                    break;
                }
            }
        }
        return new int[]{countJobs, maxProfit};
    }
}
