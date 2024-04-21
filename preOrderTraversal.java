//User function Template for Java



// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree {
  // Function to return a list containing the preorder traversal of the tree.
  public static ArrayList<Integer> preorder(Node root) {
    ArrayList<Integer> result = new ArrayList<>();
    preorderHelper(root, result);
    return result;
  }

  private static void preorderHelper(Node root, ArrayList<Integer> result) {
    if (root == null) {
      return;
    }

    result.add(root.data);

    preorderHelper(root.left, result);

    preorderHelper(root.right, result);
  }
}
