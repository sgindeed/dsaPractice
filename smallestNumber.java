class Solution {
    public String smallestNumber(int s, int d) {
        // If sum is more than the maximum possible sum with d digits
        if (s > 9 * d) {
            return "-1";
        }

        // Array to store digits of the result number
        int[] digits = new int[d];
        
        // Start filling digits from the least significant place
        for (int i = d - 1; i >= 0; i--) {
            if (s >= 9) {
                digits[i] = 9;
                s -= 9;
            } else {
                digits[i] = s;
                s = 0;
            }
        }

        // Ensure that the first digit is not zero if d > 1
        if (digits[0] == 0) {
            digits[0] = 1;
            for (int i = 1; i < d; i++) {
                if (digits[i] > 0) {
                    digits[i]--;
                    break;
                }
            }
        }

        // Build the result string from the digits array
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < d; i++) {
            result.append(digits[i]);
        }

        return result.toString();
    }
}
