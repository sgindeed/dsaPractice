class Solution {
    // Function to return a list containing the bottom view of the given tree.
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // Map to store the last node at each horizontal distance
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // Queue to perform level-order traversal
        Queue<Pair> queue = new LinkedList<>();
        
        // Start with the root node at horizontal distance 0
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            Node node = current.node;
            int hd = current.hd;

            // Put the node data in the map for the corresponding horizontal distance
            map.put(hd, node.data);

            // If there's a left child, add it to the queue with horizontal distance - 1
            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }

            // If there's a right child, add it to the queue with horizontal distance + 1
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }

        // Collect the bottom view nodes from the map
        for (Integer value : map.values()) {
            result.add(value);
        }

        return result;
    }

    // Helper class to store a node along with its horizontal distance
    class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}
