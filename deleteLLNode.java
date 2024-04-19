class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
    	if(head == null && x < 1)
    	    return head;
    	if(x == 1)
    	    return head.next;
    	Node previous = null;
    	Node current = head;
    	int count = 1;
    	
    	while (current != null && count < x) {
            previous = current;
            current = current.next;
            count++;
        }
        
        if (current == null)
            return head;
            
        previous.next = current.next;
        return head;
    }
}
