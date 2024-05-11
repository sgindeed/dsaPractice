class Solution{
  public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>>adj)
  {

    ArrayList<Integer> bfs = new ArrayList<>();
    boolean visited[] = new boolean[V+1];

    for(int i=1; i<=V; i++)
      {
        if(visited[i] == false)
        {
          Queue<Integer> q = new LinkedList<>();
          q.add(i);
          visited[i] = true;

          while(!q.isEmpty())
            {
              Integer node = q.poll();
              bfs.add(node);

              for(Integer it : adj.get(node))
                {
                  if(visited[it] == false)
                  {
                    visited[it] = true;
                    q.add(it);
                  }
                }
            }
        }
      }
      return bfs;
  }
}
    
