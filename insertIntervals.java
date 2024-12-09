class Solution {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]>res= new ArrayList<>();
        PriorityQueue<int[]>p = new PriorityQueue<>((a,b)->{
            return a[0]-b[0];
        });
        p.offer(newInterval);
        for(int el[]:intervals){
            p.offer(el);
        }
        while(!p.isEmpty()){
            int k[] = p.poll();
            if(!p.isEmpty() && p.peek()[0]<=k[1]){
                int t[] = p.poll();
                p.offer(new int[]{k[0],Math.max(k[1],t[1])});
            }
            else{
                res.add(k);
            }
        }
        return res;
    }
}
