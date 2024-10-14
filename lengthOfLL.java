class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int count = 0;
        Node current = head;
        // Traverse through the linked list and count nodes.
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
