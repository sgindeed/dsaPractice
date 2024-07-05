class Solution {
    // Function to find the vertical width of a Binary Tree.
    public int verticalWidth(Node root) {
        // If the tree is empty, the width is 0.
        if (root == null) {
            return 0;
        }

        // Set to store unique horizontal distances.
        Set<Integer> hdSet = new HashSet<>();

        // Helper function to traverse the tree and fill the set with HD values.
        computeHD(root, 0, hdSet);

        // The size of the set represents the vertical width.
        return hdSet.size();
    }

    // Recursive function to compute horizontal distances.
    private void computeHD(Node node, int hd, Set<Integer> hdSet) {
        if (node == null) {
            return;
        }

        // Add the current horizontal distance to the set.
        hdSet.add(hd);

        // Recur for the left subtree with HD - 1.
        computeHD(node.left, hd - 1, hdSet);

        // Recur for the right subtree with HD + 1.
        computeHD(node.right, hd + 1, hdSet);
    }
}
