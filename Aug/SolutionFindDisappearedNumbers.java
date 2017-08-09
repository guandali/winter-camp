public class SolutionFindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {		int max_val = Integer.MIN_VALUE;
		for(int i =0; i < nums.length; i++){
			max_val = Math.max(nums[i], max_val);
		}
        max_val = Math.max(max_val, nums.length);
		List<Integer> ans = new ArrayList<Integer>();
		int i = 0;
		while(i < max_val){
			ans.add(-1);
			i++;
		}
		for(int i1=0; i1 < nums.length; i1++){
			//Mark for delete 
			ans.set(nums[i1] - 1, -2); 
		}
		for(int i1 = 0; i1 < ans.size(); i1++){
			if(ans.get(i1) == -1){
				ans.set(i1, i1+1);
			}
		}
		ans.removeAll(Collections.singleton(-2));	
		return ans;
        
    }
}