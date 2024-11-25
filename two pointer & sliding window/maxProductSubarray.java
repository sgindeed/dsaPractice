class Solution {
    public int maxProduct(int[] nums) {
        int maxPro = nums[0];
        int minPro = nums[0];
        int res = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] < 0){
                int temp = maxPro;
                maxPro = minPro;
                minPro = temp;
            }
            maxPro = Math.max(nums[i], maxPro * nums[i]);
            minPro = Math.min(nums[i], minPro * nums[i]);

            res = Math.max(res, maxPro);
        }
        return res;
    }
}
