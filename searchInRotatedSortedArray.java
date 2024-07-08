class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int index = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key)
                index = i;
        }
        return index;
    }
}
