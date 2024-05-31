class Solution {
    static int swapNibbles(int n) {
        // code here
        int highNibble = (n & 0xF0) >> 4;
        // Extract low nibble and shift it to higher nibble position
        int lowNibble = (n & 0x0F) << 4;
        // Combine the swapped nibbles
        return highNibble | lowNibble;
    }
}