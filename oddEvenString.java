public class Solution {
    public static String oddEven(String s) {
        // Frequency map to store frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Calculate the frequency of each character
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        int x = 0; // Count of even-positioned characters with even frequency
        int y = 0; // Count of odd-positioned characters with odd frequency
        
        for (char ch : frequencyMap.keySet()) {
            int freq = frequencyMap.get(ch);
            int position = ch - 'a' + 1; // Position in the alphabet (1-based)
            
            if (position % 2 == 0) { // Even-positioned character
                if (freq % 2 == 0) { // Even frequency
                    x++;
                }
            } else { // Odd-positioned character
                if (freq % 2 == 1) { // Odd frequency
                    y++;
                }
            }
        }
        
        // Determine if the sum of x and y is even or odd
        return (x + y) % 2 == 0 ? "EVEN" : "ODD";
    }
}
