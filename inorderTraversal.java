class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }
    
    private void inorderHelper(Node node, List<Integer> result) {
        
        if (node == null) 
            return;
            
        inorderHelper(node.left, result);
        result.add(node.data);
        inorderHelper(node.right, result);
    }
}
