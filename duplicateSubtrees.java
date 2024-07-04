class Solution {
    Map<String, Integer> subtreeCount;
    List<Node> duplicateSubtrees;

    public List<Node> printAllDups(Node root) {
        subtreeCount = new HashMap<>();
        duplicateSubtrees = new ArrayList<>();
        serializeTree(root);
        return duplicateSubtrees;
    }

    private String serializeTree(Node node) {
        if (node == null) {
            return "#";  // Using "#" to represent null nodes
        }

        String serialized = node.data + "," + serializeTree(node.left) + "," + serializeTree(node.right);
        subtreeCount.put(serialized, subtreeCount.getOrDefault(serialized, 0) + 1);

        if (subtreeCount.get(serialized) == 2) {
            duplicateSubtrees.add(node);
        }

        return serialized;
    }
}
