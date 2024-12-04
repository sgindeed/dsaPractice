class Solution {
    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String concatenated = s1 + s1;
        int n = s2.length();

        long base = 31; 
        long mod = 1_000_000_007; 

        long hashS2 = 0, power = 1;
        for (int i = 0; i < n; i++) {
            hashS2 = (hashS2 * base + s2.charAt(i)) % mod;
            if (i < n - 1) {
                power = (power * base) % mod;
            }
        }

      
        long hashWindow = 0;
        for (int i = 0; i < n; i++) {
            hashWindow = (hashWindow * base + concatenated.charAt(i)) % mod;
        }

        for (int i = 0; i <= concatenated.length() - n; i++) {
            if (hashWindow == hashS2 && concatenated.substring(i, i + n).equals(s2)) {
                return true; }

            if (i < concatenated.length() - n) { 
                hashWindow = (hashWindow - concatenated.charAt(i) * power % mod + mod) % mod;
                hashWindow = (hashWindow * base + concatenated.charAt(i + n)) % mod;
            }
        }

        return false;
    }
}
