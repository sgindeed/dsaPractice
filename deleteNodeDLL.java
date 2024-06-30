class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null || x <= 0) {
            return head; // If the list is empty or position is invalid
        }
        
        Node current = head;
        
        // If head needs to be removed
        if (x == 1) {
            head = current.next; // Change head
            if (head != null) {
                head.prev = null; // Update prev pointer of new head
            }
            return head;
        }
        
        // Traverse the list to find the node at position x
        for (int i = 1; current != null && i < x; i++) {
            current = current.next;
        }
        
        // If position is more than the number of nodes
        if (current == null) {
            return head;
        }
        
        // Update the next pointer of the previous node
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        
        // Update the prev pointer of the next node
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        
        return head;
    }
}
