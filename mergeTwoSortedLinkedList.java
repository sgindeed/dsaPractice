/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node newHead = new Node(0);
        Node temp = newHead;
        while(true){
            if(head1==null){
                temp.next = head2;
                break;
            }
            if(head2==null){
                temp.next = head1;
                break;
            }
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next; 
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        return newHead.next;
   } 
}
