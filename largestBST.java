class Solution {
    
    // Helper class to store information about the subtree
    static class Info {
        int size;     // Size of the subtree
        int max;      // Maximum value in the subtree
        int min;      // Minimum value in the subtree
        boolean isBST; // If the subtree is a BST
        
        Info(int size, int max, int min, boolean isBST) {
            this.size = size;
            this.max = max;
            this.min = min;
            this.isBST = isBST;
        }
    }
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        return largestBstUtil(root).size;
    }
    
    // Utility function to return information about the subtree
    static Info largestBstUtil(Node node) {
        // Base case: An empty tree is a BST of size 0
        if (node == null) {
            return new Info(0, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        }
        
        // Recursively get information about left and right subtrees
        Info leftInfo = largestBstUtil(node.left);
        Info rightInfo = largestBstUtil(node.right);
        
        // Initialize current node's information
        Info currentInfo;
        
        // Check if the current node is a BST
        if (leftInfo.isBST && rightInfo.isBST &&
            node.data > leftInfo.max && node.data < rightInfo.min) {
            // Current node is a BST
            currentInfo = new Info(
                leftInfo.size + rightInfo.size + 1,
                Math.max(node.data, rightInfo.max),
                Math.min(node.data, leftInfo.min),
                true
            );
        } else {
            // Current node is not a BST
            currentInfo = new Info(
                Math.max(leftInfo.size, rightInfo.size),
                0,
                0,
                false
            );
        }
        
        return currentInfo;
    }
}
