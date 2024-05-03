class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<a.length; i++)
        {
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > a.length/2)
                return entry.getKey();
        }
        
        return -1;
    }
}
