class Solution {
    public int hIndex(int[] citations) {
        int h = 0;
        Arrays.sort(citations); // Sort the citations in ascending order
        int n = citations.length; // Number of papers

        for (int i = 0; i < n; i++) {
            // Check if the number of papers with at least citations[n - i - 1] >= (i + 1)
            if (citations[n - i - 1] >= (i + 1)) {
                h++;
            } else {
                break;
            }
        }
        return h;
    }
}
