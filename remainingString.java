class Solution {
    public String printString(String s, char ch, int count) {
        // Initialize the current count of occurrences of ch
        int currentCount = 0;

        // Loop through the string to find the position after ch has appeared count times
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                currentCount++;
            }
            if (currentCount == count) {
                // If the character has appeared count times, return the remaining substring
                if (i + 1 < s.length()) {
                    return s.substring(i + 1);
                } else {
                    return ""; // The remaining substring is empty
                }
            }
        }

        // If the character ch did not appear count times, return an empty string
        return "";
    }
}
