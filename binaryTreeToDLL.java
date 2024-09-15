class Solution

{

    //Function to convert binary tree to doubly linked list and return it.

    Node bToDLL(Node root)

    {

 // Your code here 

     ArrayList<Integer> arr = new ArrayList<Integer>();

     revInOrder(root, arr);

     Node head = new Node(arr.get(0));

     // prev -> left

     // next -> right

     head.left = null;

     Node curr = head;

     for(int i = 1; i < arr.size(); i++){

         Node temp = new Node(arr.get(i));

         curr.right = temp;

         temp.left = curr;

         temp.right = null;

         curr = temp;

     }

     

     return head;

     

    }

    

    void revInOrder(Node root, ArrayList<Integer> arr){

        if(root == null){

            return;

        }

        

        revInOrder(root.left, arr);

        arr.add(root.data);

        revInOrder(root.right, arr);

        

    }

    }
