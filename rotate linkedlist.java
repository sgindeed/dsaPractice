class Solution {
    public Node rotate(Node head, int k) {
        if (head == null || k == 0) return head;

        Node newHead = head, lastNode = head, newHeadPrev = null;

        while (k-- > 0) {
            newHeadPrev = newHead;
            newHead = newHead.next;
        }

        if (newHead == null) return head;

        lastNode = newHead;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = head;
        newHeadPrev.next = null;

        return newHead;
    }
}
