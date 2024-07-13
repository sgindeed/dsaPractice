import java.util.*;

class Solution {
    public List<Integer> shortestPath(int n, int m, int[][] edges) {
        // Adjacency list representation of the graph
        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph[u].add(new int[]{v, w});
            graph[v].add(new int[]{u, w});
        }
        
        // Min-heap priority queue to store {current distance, node}
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, 1});
        
        // Distance array to store shortest path to each node
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        
        // Previous node array to reconstruct the path
        int[] prev = new int[n + 1];
        Arrays.fill(prev, -1);
        
        // Dijkstra's algorithm
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currDist = curr[0];
            int u = curr[1];
            
            if (currDist > dist[u]) continue;
            
            for (int[] neighbor : graph[u]) {
                int v = neighbor[0], weight = neighbor[1];
                int newDist = currDist + weight;
                
                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.add(new int[]{newDist, v});
                    prev[v] = u;
                }
            }
        }
        
        // If there's no path to the destination node, return -1
        if (dist[n] == Integer.MAX_VALUE) {
            return Collections.singletonList(-1);
        }
        
        // Reconstruct the path from node n to node 1
        List<Integer> path = new ArrayList<>();
        for (int at = n; at != -1; at = prev[at]) {
            path.add(at);
        }
        Collections.reverse(path);
        
        // Prepare the result
        List<Integer> result = new ArrayList<>();
        result.add(dist[n]);
        result.addAll(path);
        
        return result;
    }
}
