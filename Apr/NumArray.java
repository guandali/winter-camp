public class NumArray {
    int [][] dp;

    public NumArray(int[] nums) {
        int len = nums.length;
        dp = new int [len][len];
        for (int i = 0; i < len; i ++){
            for(int j = i; j >=0; j --){
                if(i == j){
                    dp[j][i] = nums[i];
                    
                }
                else {
                    dp[j][i] = dp[j + 1][i] + nums[j];
                }
            }
        }
    }
    
    public int sumRange(int i, int j) {
        return dp[i][j];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);