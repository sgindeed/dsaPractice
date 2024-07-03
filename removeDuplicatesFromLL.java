class Solution {
    public Node removeAllDuplicates(Node head) {
        if (head == null) {
            return null;
        }

        // Dummy node to handle edge cases where the head node needs to be removed
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;  // prev is the last node before the sublist of duplicates
        Node curr = head;   // curr is the current node being examined

        while (curr != null) {
            boolean isDuplicate = false;
            // Check if the current node has duplicates
            while (curr.next != null && curr.data == curr.next.data) {
                isDuplicate = true;
                curr = curr.next;
            }

            if (isDuplicate) {
                // Skip all duplicates
                prev.next = curr.next;
            } else {
                // Move prev to the current node if no duplicates were found
                prev = prev.next;
            }

            // Move curr to the next node
            curr = curr.next;
        }

        return dummy.next;
    }
}
