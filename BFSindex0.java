class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        
        
        visited[0] = true;
        q.add(0);
        
        //BFS Begins
        while(!q.isEmpty())
        {
            Integer node = q.poll();
            bfs.add(node);
            
            for(Integer iterate : adj.get(node))
            {
                if(visited[iterate] == false)
                {
                    visited[iterate] = true;
                    q.add(iterate);
                }
            }
        }
        return bfs;
    }
}
