class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int arrSum = 0;
        for(int i=0; i<arr.length; i++)
            arrSum += arr[i];
        return ((n*(n+1))/2) - arrSum;
    }
}
