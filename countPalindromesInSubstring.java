class Solution {
    public int CountPS(String S, int N) {
       
        int i =0;
        int counter =0 ;
        while(i<N-1){
            
            int k = i+1 ;
            while(k <= N){
                
              
                if(S.substring(i,k).length() > 1){
                    if(isPallindrom(S.substring(i,k))){
                     ++ counter;
                 
                    }
                }
               else if(k == N){
                     if(S.substring(i).length() > 1){
                    if(isPallindrom(S.substring(i,k))){
                     ++ counter;
                   
                    }
                }
                }
                
                k++;
            }
            i++;
        }
        return counter;
        
    }
    
    static boolean isPallindrom(String S){
        int n = S.length();
        
        int i =0;
        while(i < n/2){
            if(S.charAt(i) != S.charAt(n-i-1)){
                return false;
            }
            i++;
        }
        return true;

    }
}
