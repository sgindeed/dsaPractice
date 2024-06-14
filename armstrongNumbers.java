class Solution {
    static String armstrongNumber(int n){
        int originalNumber = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        if (sum == originalNumber) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
