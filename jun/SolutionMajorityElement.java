public class SolutionMajorityElement {
    public int majorityElement(int[] nums) {
        int major;
        Arrays.sort(nums);
        int mid = (nums.length-1)/2;
        if(nums[0] == nums[nums.length-1]){
            major = nums[0];
        }
        else if(nums[0] == nums[mid]){
            major = nums[0];
        }
        else if(nums[mid + 1] == nums[nums.length-1]){
            major = nums[mid+1];
        }
        else {
            major = nums[mid];
        }
        
        return major;
        
        
    }
}