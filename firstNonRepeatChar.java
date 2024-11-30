class Solution {
    static char nonRepeatingChar(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }
        return '$';
    }
}
