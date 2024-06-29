class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        Node current1 = head1;
        Node current2 = head2;
        
        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
        current1 = current1.next;
            current2 = current2.next;
        }
        return (current1 == null && current2 == null);
    }
}
