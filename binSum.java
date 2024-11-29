class Solution {
    public String addBinary(String s1, String s2) {
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        int rem = 0;
        String res = "";
        
        int i = 0;
        
        while(i < len1 || i < len2 || rem == 1)
        {
            int x = 0, y = 0;
            
            if(i < len1)
            {
                x = s1.charAt(len1 - 1 - i) - '0';
            }
            
            if(i < len2)
            {
                y = s2.charAt(len2 -1 - i) - '0';
            }
            
            int result = (x + y + rem) % 2;
            rem = (x + y + rem) / 2;
            //System.out.println(i + "  " + rem);
            res = String.valueOf(result) + res;
            i++;
        }
        
        
        int count = 0;
        for(int j=0; j<res.length(); j++)
        {
            if(res.charAt(j) == '0')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        
        String ans = res.substring(count);
        return ans;
    }
}
