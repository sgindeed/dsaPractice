class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
        ArrayList<Integer> result = new ArrayList<>();
        noSiblingHelper(node, result);
        if (result.isEmpty()) // If no non-sibling nodes found, return -1 as per the problem statement.
            result.add(-1);
        else
            Collections.sort(result);
        return result;
    }

    private void noSiblingHelper(Node node, ArrayList<Integer> result) {
        if (node == null)
            return;

        if (node.left != null && node.right == null) {
            result.add(node.left.data);
        }
        else if (node.left == null && node.right != null) {
            result.add(node.right.data);
        }

        noSiblingHelper(node.left, result);
        noSiblingHelper(node.right, result);
    }
}
