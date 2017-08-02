public class SolutionProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int[nums.length];
        int [] tmp0 = new int[nums.length];
        int [] tmp1 = new int[nums.length];
        for(int i = 0, val = 1; i < nums.length; i++){
            tmp0[i] = val;
            val *= nums[i];
        }
        for(int i = nums.length - 1, val = 1; i >= 0; i--){
            tmp1[i] = val;
            val *= nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            ans[i] = tmp0[i] * tmp1[i];
        }
        return ans;
    }
}