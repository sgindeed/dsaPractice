class Solution {
    static final long MOD = 1000000007;
    
    public long multiplyTwoLists(Node first, Node second) {
        long num1 = 0, num2 = 0;
        
        // Traverse the first list and convert it to a number
        while (first != null) {
            num1 = (num1 * 10 + first.data) % MOD;
            first = first.next;
        }
        
        // Traverse the second list and convert it to a number
        while (second != null) {
            num2 = (num2 * 10 + second.data) % MOD;
            second = second.next;
        }
        
        // Multiply both numbers and take modulo
        return (num1 * num2) % MOD;
    }
}
class Solution {
    static final long MOD = 1000000007;
    
    public long multiplyTwoLists(Node first, Node second) {
        long num1 = 0, num2 = 0;
        
        // Traverse the first list and convert it to a number
        while (first != null) {
            num1 = (num1 * 10 + first.data) % MOD;
            first = first.next;
        }
        
        // Traverse the second list and convert it to a number
        while (second != null) {
            num2 = (num2 * 10 + second.data) % MOD;
            second = second.next;
        }
        
        // Multiply both numbers and take modulo
        return (num1 * num2) % MOD;
    }
}
