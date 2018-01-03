class SolutionFindTargetSumWays {
    private int ans = 0;
    public int findTargetSumWays(int[] nums, int S) {
        helper(nums, 0, S);
        return ans;
    }
    
    private void helper(int[] nums, int idx, int remain){
        if(idx == nums.length) {
            if(remain == 0) ans ++;
            return;
        }
        helper(nums, idx + 1, remain + nums[idx]);
        helper(nums, idx + 1, remain - nums[idx]);        
    }
}