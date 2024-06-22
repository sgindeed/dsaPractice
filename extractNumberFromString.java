class Solution {
    long ExtractNumber(String sentence) {
        long maxNumber = -1;
        long currentNumber = 0;
        boolean hasNumber = false;
        boolean invalid = false;

        for (int i = 0; i <= sentence.length(); i++) {
            if (i < sentence.length() && Character.isDigit(sentence.charAt(i))) {
                int digit = sentence.charAt(i) - '0';
                if (digit == 9) {
                    invalid = true;
                }
                currentNumber = currentNumber * 10 + digit;
                hasNumber = true;
            } else {
                if (hasNumber && !invalid) {
                    maxNumber = Math.max(maxNumber, currentNumber);
                }
                currentNumber = 0;
                hasNumber = false;
                invalid = false;
            }
        }

        return maxNumber;
    }
}