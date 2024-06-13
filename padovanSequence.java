class Solution {
    private static final int MOD = 1_000_000_007;

    public int padovanSequence(int n) {
        // Base cases
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }

        // Initialize the first three Padovan numbers
        int p0 = 1, p1 = 1, p2 = 1;

        // Compute the nth Padovan number with modular arithmetic
        for (int i = 3; i <= n; i++) {
            int next = (p0 + p1) % MOD;
            p0 = p1;
            p1 = p2;
            p2 = next;
        }

        // Return the nth Padovan number
        return p2;
    }
}
