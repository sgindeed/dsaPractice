import java.util.*;

class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BSTs in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        // Perform in-order traversal to get elements of both BSTs in sorted order
        inorderTraversal(root1, list1);
        inorderTraversal(root2, list2);
        
        // Merge the two sorted lists
        return mergeSortedLists(list1, list2);
    }

    // Helper function for in-order traversal to get elements in sorted order
    private void inorderTraversal(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, list);
        list.add(root.data);
        inorderTraversal(root.right, list);
    }

    // Helper function to merge two sorted lists into one sorted list
    private List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        
        // Merge both lists until one of them is exhausted
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }
        
        // Add remaining elements from list1, if any
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }
        
        // Add remaining elements from list2, if any
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }
        
        return result;
    }
}
