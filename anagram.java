class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(char c : s1.toCharArray())
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        
        for(char ch : s2.toCharArray())
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        
        return map1.equals(map2);
    }
}
