import java.util.HashSet;

class Solution {
    String removeDups(String str) {
        // Use a HashSet to keep track of seen characters
        HashSet<Character> seen = new HashSet<>();
        // Use a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();
        
        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // If the character has not been seen before, add it to the result
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        
        // Convert the StringBuilder to a String and return it
        return result.toString();
    }
}
