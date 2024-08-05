class Solution {
    public Node sortedInsert(Node head, int x) {
        Node newNode = new Node(x);
        
        // Case 1: The list is empty
        if (head == null) {
            return newNode;
        }
        
        // Case 2: Insert at the beginning
        if (x <= head.data) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        
        // Traverse the list to find the insertion point
        Node current = head;
        while (current.next != null && current.next.data < x) {
            current = current.next;
        }
        
        // Insert the new node
        newNode.next = current.next;
        newNode.prev = current;
        
        // If inserting at the end, current.next will be null
        if (current.next != null) {
            current.next.prev = newNode;
        }
        
        current.next = newNode;
        
        return head;
    }
}
