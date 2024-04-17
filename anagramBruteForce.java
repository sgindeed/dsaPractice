class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
       a = a.toLowerCase();
       b = b.toLowerCase();
       
        if(a.length() != b.length())
            return false;
        
        char[] string1 = a.toCharArray();
        char[] string2 = b.toCharArray();
        
        Arrays.sort(string1);
        Arrays.sort(string2);
        
        if(Arrays.equals(string1, string2) == true)
            return true;
        else
            return false;
    }
}
