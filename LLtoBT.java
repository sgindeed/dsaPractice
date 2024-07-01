class GfG {
    // Function to make binary tree from linked list.
    public static Tree convert(Node head, Tree node) {
        if (head == null) {
            return null;
        }

        // Create the root of the tree
        node = new Tree(head.data);
        Queue<Tree> queue = new LinkedList<>();
        queue.add(node);

        // Advance the linked list
        head = head.next;

        // Until the end of the linked list is reached, do the following steps
        while (head != null) {
            // Take the parent node from the front of the queue
            Tree parent = queue.poll();

            // Take the next node from the linked list and make it the left child
            Tree leftChild = new Tree(head.data);
            parent.left = leftChild;
            queue.add(leftChild);
            head = head.next;
            if (head == null) {
                break;
            }

            // Take the next node from the linked list and make it the right child
            Tree rightChild = new Tree(head.data);
            parent.right = rightChild;
            queue.add(rightChild);
            head = head.next;
        }

        return node;
    }
