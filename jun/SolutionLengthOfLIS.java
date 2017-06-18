public class SolutionLengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length < 1) return 0;
        int[] t = new int[nums.length];
        t[0] = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++){
            t[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    t[i] = Math.max(t[i], t[j]+1);
                }
                
            }
            max = Math.max(t[i], max);
        }
        
        return (max == Integer.MIN_VALUE)?(1):(max);
        
        
    }
}