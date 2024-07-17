class Solution {
    // Function to construct binary tree from parent array.
    public Node createTree(int parent[]) {
        int n = parent.length;
        Node[] created = new Node[n];
        
        for (int i = 0; i < n; i++) {
            created[i] = new Node(i);
        }
        
        Node root = null;
        
        for (int i = 0; i < n; i++) {
            if (parent[i] == -1) {
                root = created[i];
            } else {
                Node parentNode = created[parent[i]];
                if (parentNode.left == null) {
                    parentNode.left = created[i];
                } else {
                    parentNode.right = created[i];
                }
            }
        }
        
        return root;
    }
}
