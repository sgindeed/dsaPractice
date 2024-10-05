class Solution {
    public long findSmallest(int[] arr) {
        int n=arr.length;
	        long sum=0;
	        for(int i=0;i<n;i++){
	        	if(sum+1<arr[i])return sum+1;
	      	    sum+=arr[i];
	        }
			return sum+1;
    }
}
