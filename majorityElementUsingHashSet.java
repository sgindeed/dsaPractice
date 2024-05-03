import java.util.HashSet;

class Solution {
    static int majorityElement(int a[], int size) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int num : set) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == num) {
                    count++;
                }
            }
            if (count > size / 2) {
                return num;
            }
        }

        return -1;
    }
}
