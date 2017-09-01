public class SolutionProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i = 0, val = 1; i < nums.length; i++){
            ans[i] = val;
            val *= nums[i];
        }
        for(int i = nums.length - 1, val = 1; i >= 0; i--){
            ans[i] *= val;
            val *= nums[i];
        }
        return ans;
    }
}