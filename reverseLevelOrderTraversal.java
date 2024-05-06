class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null) return result;
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> levelNodes = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                levelNodes.add(current.data);
                
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            
            Collections.reverse(levelNodes);
            result.addAll(levelNodes);
        }
        
        Collections.reverse(result);
        
        return result;
        
    }
}
