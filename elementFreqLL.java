class Solution {
    public static int count(Node head, int key) {
        int count = 0;
        Node current = head;
        
        while (current != null) {
            if (current.data == key) {
                count++;
            }
            current = current.next;
        }
        
        return count;
    }
}
