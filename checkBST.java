class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        return isBSTUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // Utility function to check the validity of BST within a given range
    boolean isBSTUtil(Node node, long min, long max) {
        // An empty tree is a BST
        if (node == null) {
            return true;
        }

        // If this node violates the min/max constraint, then it's not a BST
        if (node.data <= min || node.data >= max) {
            return false;
        }

        // Otherwise, check the subtrees recursively tightening the min/max constraints
        return isBSTUtil(node.left, min, node.data) && isBSTUtil(node.right, node.data, max);
    }
}