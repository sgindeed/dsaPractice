class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        for(int i=0 ;i<n-1; i++)
        {
            HashSet<Integer> set = new HashSet<>();
            int target = -arr[i];
            for(int j = i+1; j<n; j++)
            {
                if(set.contains(target - arr[j]))
                    return true;
                set.add(arr[j]);
            }
        }
        return false;
    }
}
