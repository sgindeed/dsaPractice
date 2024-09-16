class Solution{
    static int maxLength(String S){
        int n = S.length();
        int open=0; int close=0;
        int ans=0;
        //left to right
         for(int i=0; i<n; i++){
            char ch = S.charAt(i);
            if(ch=='(') open++;
            else close++;
            
            if(open == close) ans = Math.max(ans, open*2);
            
            else if(close > open)  close=open=0;
         }
         open=0; close=0;
         //right to left
         for(int i=n-1; i>=0; i--){
            char ch = S.charAt(i);
            if(ch=='(') open++;
            else close++;
            
           if(open == close) ans = Math.max(ans, open*2);
            
            else if(open > close)  close=open=0;
         }
         return ans;
    }
}
