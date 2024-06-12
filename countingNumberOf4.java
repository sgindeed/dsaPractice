class Solution {
    public static int countNumberswith4(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (containsDigit4(i)) {
                count++;
            }
        }
        return count;
    }
    
    private static boolean containsDigit4(int number) {
        while (number > 0) {
            if (number % 10 == 4) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
