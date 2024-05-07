class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
        if (root == null)
            return allPaths;

        ArrayList<Integer> currentPath = new ArrayList<>();
        findPaths(root, currentPath, allPaths);
        return allPaths;
    }

    private static void findPaths(Node node, ArrayList<Integer> currentPath, ArrayList<ArrayList<Integer>> allPaths) {
        if (node == null)
            return;

        currentPath.add(node.data);

        if (node.left == null && node.right == null) {
            // If it's a leaf node, add the current path to allPaths
            allPaths.add(new ArrayList<>(currentPath));
        } else {
            // Continue traversing left and right subtrees
            findPaths(node.left, currentPath, allPaths);
            findPaths(node.right, currentPath, allPaths);
        }

        // Backtrack: remove current node from the current path
        currentPath.remove(currentPath.size() - 1);
    }
}
