class Solution{
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        TreeMap<Integer, Integer> verticalSumMap = new TreeMap<>();
        verticalSumHelper(root, 0, verticalSumMap);

        result.addAll(verticalSumMap.values());

        return result;
    }

    private void verticalSumHelper(Node node, int verticalLine, TreeMap<Integer, Integer> map) {
        if (node == null) return;

        verticalSumHelper(node.left, verticalLine - 1, map);

        map.put(verticalLine, map.getOrDefault(verticalLine, 0) + node.data);

        verticalSumHelper(node.right, verticalLine + 1, map);
    }
}
