public class SolutionFindPeakElement {
    public int findPeakElement(int[] nums) {
        int ans = -1;
        if(nums.length < 1)  return -1;
        if(nums.length == 1) return 0;
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            int right = (mid + 1 < nums.length)?(nums[mid+1]):(Integer.MIN_VALUE);
            int left =  (mid - 1 >= 0)?(nums[mid-1]):(Integer.MIN_VALUE);
            if(nums[mid]> right && nums[mid] > left){
                ans = mid;
                break;
            }
            else if(nums[mid] > right && nums[mid] < left) hi = mid - 1;
            else if(nums[mid] > left && nums[mid] < right) lo = mid + 1;
            else {
                lo = mid + 1;
            }
            
        }
        return ans;
        
        
    }
}