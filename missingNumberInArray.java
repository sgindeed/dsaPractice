class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int arraySum = 0;
        int sum = 0;
        sum = n*(n+1)/2;
        for(int i=0; i<n-1; i++)
        {
            sum -= array[i];
        }
        return sum;
    }
}
