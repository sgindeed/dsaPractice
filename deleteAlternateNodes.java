class Solution {
    public void deleteAlt(Node head) {
        if (head == null) {
            return;
        }
        
        Node current = head;
        while (current != null && current.next != null) {
            current.next = current.next.next;
            current = current.next;
        }
    }
}
