class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        HashMap<Character, Integer> map = new HashMap<>();
        int n = a.length();
        int p = b.length();
       
        if(n!=p)
            return false;

        for(int i=0;i<n;i++)
        {
            char ch = a.charAt(i);
            if(map.containsKey(ch) == false)
                map.put(ch,1);
            else
                map.put(ch,map.get(ch) + 1);
        }

        for(int i=0;i<p;i++)
        {
            char ch= b.charAt(i);
            if(map.containsKey(ch) == false)
            {
                return false;
            }
            if(map.get(ch)==1)
            {  
              map.remove(ch);
            }
            else
            {
                map.put(ch, map.get(ch) - 1);
            }
           
        }
    return true;
    }   
}
