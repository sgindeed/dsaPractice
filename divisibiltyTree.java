import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minimumEdgeRemove(int n, int[][] edges) {
        // Create adjacency list for the tree
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            tree.get(edge[0] - 1).add(edge[1] - 1);
            tree.get(edge[1] - 1).add(edge[0] - 1);
        }
        
        // Array to store the size of each subtree
        int[] subtreeSize = new int[n];
        boolean[] visited = new boolean[n];
        
        // Function to perform DFS and calculate subtree sizes
        class DFS {
            int removableEdges = 0;

            int dfs(int node) {
                visited[node] = true;
                int size = 1;  // size of subtree rooted at this node
                for (int neighbor : tree.get(node)) {
                    if (!visited[neighbor]) {
                        size += dfs(neighbor);
                    }
                }
                subtreeSize[node] = size;

                // Check if this subtree can be separated
                if (node != 0 && size % 2 == 0) {
                    removableEdges++;
                }
                return size;
            }
        }
        
        DFS dfs = new DFS();
        dfs.dfs(0);  // Start DFS from the root node (node 1, which is index 0)
        
        return dfs.removableEdges;
    }
}
