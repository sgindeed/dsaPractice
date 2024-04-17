//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
         for (int i = 0; i < n; i++) {
            min = Math.min(a[i], min);
            max = Math.max(a[i], max);
        }
    return new Pair(min, max);
    }
}
