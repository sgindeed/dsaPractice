class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        findAncestors(root, target, result);
        return result;
    }

    private boolean findAncestors(Node node, int target, ArrayList<Integer> ancestors) {
        if (node == null) {
            return false;
        }

        if (node.data == target) {
            return true;
        }

        // Check if target is in left or right subtree
        if (findAncestors(node.left, target, ancestors) || findAncestors(node.right, target, ancestors)) {
            ancestors.add(node.data);
            return true;
        }

        return false;
    }
