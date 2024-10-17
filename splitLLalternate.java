class Solution {
    Node[] alternatingSplitList(Node head) {
        Node firstList = null, secondList = null;
        Node firstTail = null, secondTail = null;
        Node current = head;
        boolean toggle = true;

        while (current != null) {
            if (toggle) {
                if (firstList == null) {
                    firstList = current;
                    firstTail = current;
                } else {
                    firstTail.next = current;
                    firstTail = firstTail.next;
                }
            } else {
                if (secondList == null) {
                    secondList = current;
                    secondTail = current;
                } else {
                    secondTail.next = current;
                    secondTail = secondTail.next;
                }
            }
            toggle = !toggle;
            current = current.next;
        }

        if (firstTail != null) firstTail.next = null;
        if (secondTail != null) secondTail.next = null;

        return new Node[]{firstList, secondList};
    }
}
