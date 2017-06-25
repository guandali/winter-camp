public class SolutionCombinationSum3 {
    private int[] nums = {1,2,3,4,5,6,7,8,9};
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        helper(ans, temp, n, k, 0);
        return ans;
        
    }
    
    private void helper(List<List<Integer>> ans, List<Integer>temp, int remain, int count, int idx){
        if(remain <= 0 || count <= 0 || idx >= nums.length){
            if(remain == 0 && count == 0){
                ans.add(new ArrayList<Integer>(temp));
                return;
            }
            else {
                return;
            }
        }
        else {
            for(int i = idx; i < nums.length; i++){
                temp.add(nums[i]);
                //System.out.println("nums[i] :" + nums[i]);
                //count = count-1;
                helper(ans, temp, remain - nums[i], count-1, i + 1);
                temp.remove(temp.size()-1);
                
            }
        }
        
    }
}