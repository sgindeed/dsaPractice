class Solution {
    public String longestCommonPrefix(String arr[]) {
        if (arr == null || arr.length == 0) {
            return "-1";
        }

        // Find the minimum length string in the array
        int minLen = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < minLen) {
                minLen = arr[i].length();
            }
        }

        // Use the minimum length to limit the prefix length
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            char currentChar = arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (arr[j].charAt(i) != currentChar) {
                    return prefix.length() > 0 ? prefix.toString() : "-1";
                }
            }
            prefix.append(currentChar);
        }

        return prefix.length() > 0 ? prefix.toString() : "-1";
    }
}
