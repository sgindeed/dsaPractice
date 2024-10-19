// User function Template for Java

class Solution {

    String roundToNearest(String str) {
        int n = str.length();
        int lastDigit = str.charAt(n - 1) - '0';
        String base = str.substring(0, n - 1);

        if (lastDigit <= 5) {
            return base + "0";
        } else {
            StringBuilder sb = new StringBuilder(base);
            for (int i = n - 2; i >= 0; i--) {
                if (sb.charAt(i) != '9') {
                    sb.setCharAt(i, (char)(sb.charAt(i) + 1));
                    return sb.toString() + "0";
                }
                sb.setCharAt(i, '0');
            }
            return "1" + sb.toString() + "0";
        }
    }
}

