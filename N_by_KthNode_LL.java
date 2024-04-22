class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class GfG
{
    public static int countNumberOfNodes(Node head) {
        
        int counter = 0;
        while (head != null) {
            counter++;
            head = head.next;
        }
        return counter;
    }

    public static int nknode(Node head, int k)
    {
       // add your code here
        Node current = head;
        int numberOfNodes = countNumberOfNodes(current);
        
        current = head;
        int position;
        if ((numberOfNodes % k) == 0) {
            position = numberOfNodes / k;
        } else {
            position = (numberOfNodes / k) + 1;
        }
        while (head != null && position > 1) {
            position--;
            current = current.next;
        }
        if (current == null) {
            return -1;
        }
        return current.data;
    }
}
