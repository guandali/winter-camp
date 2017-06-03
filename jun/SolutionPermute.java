public class SolutionPermute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList();
        backTrack(ans, temp, nums);
        return ans;
    }
    
    public void backTrack(List<List<Integer>> ans, List<Integer> temp, int[] nums){
        if(temp.size() >= nums.length){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i =0; i < nums.length; i++){
            if(temp.contains(nums[i])){
                continue;
            }
            else{
                temp.add(nums[i]);
                backTrack(ans, temp, nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}