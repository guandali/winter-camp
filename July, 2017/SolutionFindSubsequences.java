public class SolutionFindSubsequences {
    private int [] nums;
    public List<List<Integer>> findSubsequences(int[] nums) {
        this.nums = nums;  
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        helper(ans, temp, 0);
        return ans;
        
        
    }
    
    private void helper(List<List<Integer>> ans, List<Integer> temp, int idx){
      if(temp.size() > 1) {
          ans.add(new ArrayList<Integer>(temp));
      }
      Set<Integer> hasUsed = new HashSet<Integer>();
      for(int i = idx; i < nums.length; i++ ){
          if(idx > 0 && nums[idx -1]  > nums[i]) continue;
          if(hasUsed.contains(nums[i])) continue;
                  temp.add(nums[i]);
                  hasUsed.add(nums[i]);
                  helper(ans, temp, i + 1 );
                  temp.remove(temp.size() - 1 );
          
      }
      
        
    }
}