public class SolutionthreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length <3){
            return Integer.MAX_VALUE;
        }
        int  min_value = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length -2; i++){
            // for(int j = i+1; j < nums.length -1; j++ ){
            //     for(int k = j+1; k<nums.length; k++){
            //         if( Math.abs(target - (nums[i]+nums[j]+nums[k])) <= min_value){
            //             min_value = Math.abs(target - (nums[i]+nums[j]+nums[k]));
            //             ans = nums[i]+nums[j]+nums[k];
                        
            //         }
                   
            //     }
            // }
            int j = i+1;
            int k = nums.length-1;
            while (j <k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum >target){
                    k--;
                }
                else if (sum <target) {
                    j++;
                    
                }
                else {
                    return sum;
                }
                if( Math.abs(target - sum) <= min_value){
                  min_value = Math.abs(target - sum);
                  ans = sum;
                        
               }
                
                
            }
        }
        
        return ans;

        
    }
}
