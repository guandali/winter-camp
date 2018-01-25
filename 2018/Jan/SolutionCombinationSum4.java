class SolutionCombinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        int [] dp = new int[target+1];
        Arrays.fill(dp, -1);
        return dfsHelper(nums,dp,target);
    }
    private int dfsHelper(int [] nums,int[] dp, int remain){
        if(remain==0) return 1;
        else if(remain<0) return 0;
        else {
            if(dp[remain]==-1){
                int sum = 0;
                for(int num:nums){
                    sum += dfsHelper(nums, dp, remain-num);
                }
                dp[remain] = sum;
            }
            return dp[remain];
        }
    }
}