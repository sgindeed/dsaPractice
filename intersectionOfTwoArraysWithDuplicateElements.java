class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        Set<Integer> s=new HashSet<>();
        int i=0;
        int j=0;
        while(i<a.length&&j<b.length)
        
    {
        if(a[i]==b[j])
        {
            s.add(a[i]);
            i++;
            j++;
            
        }
        else if(a[i]>b[j])
        {
            j++;
        }
        else if(a[i]<b[j])
        {
            i++;
        }

        
    }
    return new ArrayList<>(s);
    }
}
