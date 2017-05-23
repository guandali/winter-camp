public class SolutionSearchInRotateArray {
    public int search(int[] nums, int target) {
        int ans = -1;
        if(nums.length < 1){
            return ans;
        }
        int lo = 0;
        int hi = nums.length-1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }
            if(nums[lo] <= nums[mid]){
                if(target >= nums[lo] && target < nums[mid]){
                    hi = mid -1;
                }
                else {
                    lo = mid + 1;
                }
            }
            else {
                if(target > nums[mid] && target <= nums[hi]){
                    lo = mid + 1;
                }
                else {
                    hi = mid -1;
                }
            }

        }
        
        return ans;
        
    }
}
