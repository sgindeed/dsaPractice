class Solution {
    /* You are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        // If the root is null, there can't be a path, so return false
        if (root == null) {
            return false;
        }
        
        // If we reach a leaf node, check if the remaining target equals the leaf's value
        if (root.left == null && root.right == null) {
            return target == root.data;
        }
        
        // Recur for the left and right subtrees with the reduced target
        int newTarget = target - root.data;
        return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
    }
}