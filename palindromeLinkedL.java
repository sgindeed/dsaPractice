class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        if (head == null) {
            return true;
        }
        Node tor = head;
        Node hare = head;
        while (hare.next != null && hare.next.next != null) {
            tor = tor.next;
            hare = hare.next.next;
        }
        tor.next = reverse(tor.next);
        hare = tor.next;
        tor = head;
        // Node temp = hare;
        // while (temp != null) {
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
        
        while (hare != null ) {
            if (tor.data != hare.data) {
                return false;
            }
            tor = tor.next;
            hare = hare.next;
        }
        return true;
    }
    
    Node reverse(Node root) {
        Node prev = null, temp = root, next = null;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}
