class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node current = head, previous = null, after = null;
        
        while(current != null)
        {
            after = current.next;
            current.next = previous;
            previous = current;
            current = after;
        }
        return previous;
    }
}
