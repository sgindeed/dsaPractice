class Solution {

    // Helper method to check if a tree is a Sum Tree and return the sum of nodes.
    private int isSumTreeUtil(Node node) {
        // Base cases
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return node.data;
        }

        // Recursively get the sum of left and right subtrees
        int leftSum = isSumTreeUtil(node.left);
        int rightSum = isSumTreeUtil(node.right);

        // If any of the subtree is not a sum tree, propagate -1
        if (leftSum == -1 || rightSum == -1) {
            return -1;
        }

        // Check if the current node's value is equal to the sum of left and right subtrees
        if (node.data != leftSum + rightSum) {
            return -1;
        }

        // Return the sum of nodes under this subtree including the current node
        return node.data + leftSum + rightSum;
    }

    // Main method to check if the tree is a Sum Tree
    boolean isSumTree(Node root) {
        return isSumTreeUtil(root) != -1;
    }
}
