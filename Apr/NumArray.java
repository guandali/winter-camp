
public class NumArray {
    int [] dp;
    int [] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        int len =  nums.length;
        if (len == 0) return;
        dp = new int[len];
        dp[0] = nums[0];
        for(int i = 1; i < len; i++){
            dp[i] = dp[i-1] + nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        if(i>j) return -1;
        return dp[j] - dp[i] + nums[i];
        
    }
}
// public class NumArray {
//     int [][] dp;

//     public NumArray(int[] nums) {
//         int len = nums.length;
//         dp = new int [len][len];
//         for (int i = 0; i < len; i ++){
//             for(int j = i; j >=0; j --){
//                 if(i == j){
//                     dp[j][i] = nums[i];
                    
//                 }
//                 else {
//                     dp[j][i] = dp[j + 1][i] + nums[j];
//                 }
//             }
//         }
//     }
    
//     public int sumRange(int i, int j) {
//         return dp[i][j];
        
//     }
// }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);