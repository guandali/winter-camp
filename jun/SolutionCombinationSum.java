public class SolutionCombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>(); 
        List<Integer> temp = new ArrayList<Integer>();
        backTrack(ans, temp, candidates, 0, target );
        return ans;
    }
    
    private void backTrack(List<List<Integer>> ans, List<Integer> temp, int[] nums, int idx, int remain){
        if(remain < 0 ){
            return;
        }
        else if(remain == 0){
            ans.add(new ArrayList<>(temp));
            return;
            
        }
        for(int i = idx; i < nums.length; i++){
            temp.add(nums[i]);
            backTrack(ans, temp, nums, i, remain - nums[i] );
            temp.remove(temp.size()-1);
            
        }
        
    }
}