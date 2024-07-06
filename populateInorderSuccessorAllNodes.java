class Solution {
    // Previous node in in-order traversal
    private Node prev = null;

    public void populateNext(Node root) {
        // Call the recursive helper function with the root node
        inorderTraversal(root);
    }

    // Helper function to perform in-order traversal and populate next pointers
    private void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        // Traverse the left subtree
        inorderTraversal(node.left);

        // If prev is not null, set the next pointer of prev to current node
        if (prev != null) {
            prev.next = node;
        }

        // Update prev to current node
        prev = node;

        // Traverse the right subtree
        inorderTraversal(node.right);
    }
}
