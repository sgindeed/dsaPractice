import java.util.*;

class Solution {
    
    public int[] shortestPath(int[][] edges, int n, int m, int src) {
        // Create an adjacency list to represent the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Add the edges to the adjacency list
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        // Array to store the shortest path distance from the source
        int[] dist = new int[n];
        Arrays.fill(dist, -1); // Initialize distances to -1
        
        // BFS setup
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        dist[src] = 0; // Distance to itself is 0
        
        // BFS loop
        while (!queue.isEmpty()) {
            int node = queue.poll();
            int currentDist = dist[node];
            
            // Explore all neighbors
            for (int neighbor : adj.get(node)) {
                if (dist[neighbor] == -1) { // If not visited
                    dist[neighbor] = currentDist + 1;
                    queue.add(neighbor);
                }
            }
        }
        
        return dist;
    }
}
