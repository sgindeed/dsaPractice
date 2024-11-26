class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int kadanes(int []arr){
        int sum=arr[0];
        int currSum=arr[0];
        for(int i=1;i<arr.length;i++){
         currSum=Math.max(arr[i],currSum+arr[i]);
        sum=Math.max(sum,currSum);
        }
        return sum;
}
    public int circularSubarraySum(int arr[]) {

int num=arr.length;
int Normal=kadanes(arr);
int total=0;
for(int i=0;i<num;i++){
    total+=arr[i];
    arr[i]=-arr[i];
    
}
int invert=kadanes(arr);
int min=-invert;
if(total==min){
    return Normal;
}
return Math.max(Normal,total-min);

    }
}
