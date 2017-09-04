public class SolutionCombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(candidates);
        backTracking(candidates, ans, temp, target, 0);
        return ans;
    }
    public void backTracking(int[] nums, List<List<Integer>> ans, List<Integer> temp, int remain, int idx){
        if(remain < 0 ){
            return;
        }
        else if(remain == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i < nums.length; i++){
            if(i > idx && nums[i-1] == nums[i]) continue;
            temp.add(nums[i]);
            backTracking(nums, ans, temp, remain - nums[i], i+1);
            temp.remove(temp.size()-1);
            
        }
        
        
    }
}
