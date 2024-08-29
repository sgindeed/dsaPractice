class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        if (head == null || head.next == null) {
            return 0; // No loop if the list is empty or has only one node.
        }

        Node slow = head;
        Node fast = head;

        // Detect loop using Floyd’s Cycle-Finding Algorithm.
        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move slow pointer by 1 step.
            fast = fast.next.next;      // Move fast pointer by 2 steps.

            // Check if the two pointers meet, indicating a loop.
            if (slow == fast) {
                return countLoopLength(slow); // Calculate the loop length.
            }
        }

        return 0; // No loop detected.
    }

    // Helper function to count the number of nodes in the loop.
    private int countLoopLength(Node meetingPoint) {
        int count = 1; // Initialize count to 1 because we start counting from the meeting point.
        Node current = meetingPoint;

        // Traverse the loop until we return to the meeting point.
        while (current.next != meetingPoint) {
            count++;
            current = current.next;
        }

        return count;
    }
}
