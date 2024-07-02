class Solution {
    public boolean compute(Node root) {
        
        StringBuilder combinedString = new StringBuilder();
        Node current = root;
        
        while (current != null) {
            combinedString.append(current.data);
            current = current.next;
        }
        
        String str = combinedString.toString();
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
