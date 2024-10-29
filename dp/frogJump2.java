class Solution {
    public int maxJump(int[] stones) {
        int path = stones[1] - stones[0];
        for(int i=2; i<stones.length; i++)
            path = Math.max(path, stones[i] - stones[i-2]);
        return path;
    }
}
