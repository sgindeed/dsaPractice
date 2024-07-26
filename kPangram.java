class Solution {
    boolean kPangram(String str, int k) {
       // Initialize frequency array for 26 letters
        int[] freq = new int[26];
        
        int cnt = 0;
        
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            freq[Character.toLowerCase(ch) - 'a']++;
        }
        
        int totalCnt = 0;
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) cnt++;
            else totalCnt += (freq[i] - 1);
        }
        
        return cnt <= k && cnt <= totalCnt;
    }
}