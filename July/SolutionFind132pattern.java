public class SolutionFind132pattern {
    public boolean find132pattern(int[] nums) {
        boolean ans = false;
        if(nums == null || nums.length <3) return ans;
        int min = nums[0];
        for(int i = 0; i < nums.length - 1; i++ ){
            min = Math.min(min, nums[i]);
            if(min != nums[i]){
               for(int j  = i + 1; j < nums.length; j++){
                   if(nums[j] < nums[i] && nums[j] > min){
                       return true;
                   }
                
               }
            }

            
        }
        return ans;
        
        
    }
}