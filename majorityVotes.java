class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.isEmpty()) return result;

        int count1 = 0, count2 = 0;
        Integer candidate1 = null, candidate2 = null;

        // Step 1: Find potential candidates
        for (int num : nums) {
            if (candidate1 != null && num == candidate1.intValue()) {
                count1++;
            } else if (candidate2 != null && num == candidate2.intValue()) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (candidate1 != null && num == candidate1.intValue()) count1++;
            else if (candidate2 != null && num == candidate2.intValue()) count2++;
        }

        int n = nums.size();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        // If no majority element exists, return -1
        if (result.isEmpty()) result.add(-1);

        // Return the result sorted in increasing order
        result.sort(Integer::compareTo);
        return result;
    }
}
