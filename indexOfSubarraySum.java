class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        ArrayList<Integer> list =  new ArrayList<>();
        ArrayList<Integer> returnList =  new ArrayList<>();
        
         int sum = 0;
         int start = 0;
     
     if(s == 0 ){
          for ( int i =0 ; i< n; i ++){
            if(sum==arr[i] ){
              list.add(i+1);
              list.add(i+1);
              break;
            }
              
          }
          
          
     }
      else{
          
        for ( int i =0 ; i< n; i ++){
            sum = sum+arr[i];
            while (sum > s && start <=i ){
                sum = sum - arr[start];
                start++;
            }
            if(sum==s  ){
              list.add(start+1);
              list.add(i+1);
              break;
            }
        }
      }
        if(list.isEmpty()){
           list.add(-1) ;
        }
        return list;
        
    }
    
}
