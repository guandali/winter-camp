public class SolutionFindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        double temp = 0;
        for(int i  = 0; i < k; i++){
            temp += nums[i];
        }
        double sum = temp;
        for(int i = k; i < nums.length; i++){
            temp = temp - nums[i-k] + nums[i];
            sum = Math.max(sum, temp);
        }
        
        return sum/k;
        
    }
}