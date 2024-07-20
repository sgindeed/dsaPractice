class Solution {
    // Return the root of the modified tree after removing all the half nodes.
    public Node RemoveHalfNodes(Node root) {
        // Code Here
        if (root == null) {
            return null;
        }

        // Recursively call for left and right subtrees
        root.left = RemoveHalfNodes(root.left);
        root.right = RemoveHalfNodes(root.right);

        // If this is a half node with only left child
        if (root.left != null && root.right == null) {
            return root.left;
        }

        // If this is a half node with only right child
        if (root.right != null && root.left == null) {
            return root.right;
        }

        // If this is a full node or a leaf node, return the node itself
        return root;
    }
}
