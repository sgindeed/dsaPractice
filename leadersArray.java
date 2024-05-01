class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int maxRight = arr[n-1];
        result.add(maxRight);
        
        for(int i=n-2; i>=0; i--)
        {
            if(arr[i] >= maxRight)
            {
                result.add(arr[i]);
                maxRight = arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}
