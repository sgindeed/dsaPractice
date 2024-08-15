class Solution {
    public Node addOne(Node head) {
        // Reverse the linked list
        head = reverseList(head);
        
        Node curr = head;
        int carry = 1; // Start with the carry as 1 since we need to add 1

        // Traverse the list and add the carry
        while (curr != null) {
            int sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;

            // Move to the next node
            if (curr.next == null && carry != 0) {
                curr.next = new Node(carry); // Add a new node if carry is not zero and we're at the last node
                break;
            }
            curr = curr.next;
        }

        // Reverse the list back to its original order
        head = reverseList(head);
        return head;
    }

    // Helper function to reverse the linked list
    private Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
