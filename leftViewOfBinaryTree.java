import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Tree {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            // Number of nodes at the current level
            int n = queue.size();
            
            // Traverse all nodes of the current level
            for (int i = 0; i < n; i++) {
                Node node = queue.poll();
                
                // If this is the first node of this level, add it to the result
                if (i == 0) {
                    result.add(node.data);
                }
                
                // Add left child to queue
                if (node.left != null) {
                    queue.add(node.left);
                }
                
                // Add right child to queue
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        
        return result;
    }
}
