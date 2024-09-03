class Solution
{
    public int minOperations(String str1, String str2) 
    { 
        int length1=str1.length();
        int length2=str2.length();
        
        int dp[][]=new int[length1+1][length2+1];
        
        for(int i=0;i<length1;i++)
        {
            Arrays.fill(dp[i],0);
        }
        
        for(int i=1;i<=length1;i++)
        {
            for(int j=1;j<=length2;j++)
            {
                
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                  
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
            
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return length1+length2-2*dp[length1][length2];
    }
}
 
