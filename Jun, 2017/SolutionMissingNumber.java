public class SolutionMissingNumber {
    public int missingNumber(int[] nums) {
        int lo = 0;
        int hi = nums.length -1;
        Arrays.sort(nums);
        while(lo <= hi){

            int mid = lo + (hi - lo)/2;
            if(nums[mid] == mid + 1 && ( mid == 0 || (mid - 1 >= 0 && nums[mid-1] == mid -1)) ){
                return mid;
            }
            if(nums[mid] == mid){
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
            
        }
        
        return nums.length;
        
    }
}
