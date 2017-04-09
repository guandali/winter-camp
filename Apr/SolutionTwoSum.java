public class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] results = new int [2];
        results[0] = -1;
        results[1] = -1;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(i != j && nums[i] + nums[j] == target){
                    results[0] = j;
                    results[1] = i;
                }
            }
        }
        return results;
        
    }
}