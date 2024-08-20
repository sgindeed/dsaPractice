class Solution
{
    static Node targetNode = null;
    
    public static int minTime(Node root, int target) 
    {
        Map<Node, Node> parentMap = new HashMap<>();
        markParents(root, parentMap, target);
        return bfs(targetNode, parentMap);
    }

    private static void markParents(Node root, Map<Node, Node> parentMap, int target) 
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) 
        {
            Node current = queue.poll();
            if (current.data == target) 
            {
                targetNode = current;
            }
            if (current.left != null) 
            {
                parentMap.put(current.left, current);
                queue.add(current.left);
            }
            if (current.right != null) 
            {
                parentMap.put(current.right, current);
                queue.add(current.right);
            }
        }
    }

    private static int bfs(Node targetNode, Map<Node, Node> parentMap) 
    {
        Queue<Node> queue = new LinkedList<>();
        Map<Node, Boolean> visited = new HashMap<>();
        
        queue.add(targetNode);
        visited.put(targetNode, true);
        int time = 0;
        
        while (!queue.isEmpty()) 
        {
            int size = queue.size();
            boolean flag = false;
            
            for (int i = 0; i < size; i++) 
            {
                Node current = queue.poll();
                
                if (current.left != null && !visited.containsKey(current.left)) 
                {
                    flag = true;
                    visited.put(current.left, true);
                    queue.add(current.left);
                }
                
                if (current.right != null && !visited.containsKey(current.right)) 
                {
                    flag = true;
                    visited.put(current.right, true);
                    queue.add(current.right);
                }
                
                if (parentMap.containsKey(current) && !visited.containsKey(parentMap.get(current))) 
                {
                    flag = true;
                    visited.put(parentMap.get(current), true);
                    queue.add(parentMap.get(current));
                }
            }
            
            if (flag) 
            {
                time++;
            }
        }
        
        return time;
    }
}
