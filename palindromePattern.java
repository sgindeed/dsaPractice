
class Solution {
    public String pattern(int[][] arr) {
        // Code here
        for(int i=0;i<arr.length;i++)
        {
            int k=arr[0].length-1;
            for(int j=0;j<arr[0].length;j++)
            {
                
                if(arr[i][j]!=arr[i][k])
                break;
                k--;
            }
            if(k==-1)
            {
                String s="";
                s+=i+" "+'R';
            return s;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int k=arr[0].length-1;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[j][i]!=arr[k][i])
                break;
                k--;
            }
            if(k==-1)
            {
                String s="";
                s+=i+" "+'C';
            return s;
            }
        }
        return "-1";
    }
}
