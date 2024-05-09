import java.util.*;

class Solution {
    public List<List<Integer>> CombinationSum2(int[] arr, int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Sort the array to handle duplicates
        backtrack(result, new ArrayList<>(), arr, k, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] arr, int remain, int start) {
        if (remain == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        } else if (remain < 0) {
            return;
        } else {
            for (int i = start; i < arr.length; i++) {
                if (i > start && arr[i] == arr[i - 1]) continue; // skip duplicates
                tempList.add(arr[i]);
                backtrack(result, tempList, arr, remain - arr[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Solution solution = new Solution();
            List<List<Integer>> ans = solution.CombinationSum2(a, n, k);
            for (List<Integer> list : ans) {
                for (int x : list) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            if (ans.size() == 0) {
                System.out.println();
            }
        }
    }
}
