
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i=0; i<arr.length; i++)
            minHeap.add(arr[i]);
            
        for(int i=0; i<k-1; i++)
            minHeap.poll();
            
        return minHeap.peek();
    } 
}
