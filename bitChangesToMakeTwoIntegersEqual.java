class Solution {
    public int minChanges(int n, int k) {
        int changes = 0;
        int nones = 0;

        for(int i=0; i<32; i++)
        {
            int nbit = (n>>i) & 1;
            int kbit = (k>>i) & 1;

            if(nbit == 1)
                nones++;

            if(nbit == 1 && kbit == 0)
                changes++;
            
            if(kbit == 1 && nbit == 0)
                    return -1;
        }

        if(Integer.bitCount(k) > nones)
            return -1;
        
        return changes;
    }
}
