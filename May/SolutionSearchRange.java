public class SolutionSearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int lo= 0;
        int hi= nums.length -1;
        //Find left first 
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(nums[mid] == target && (mid == 0 || (mid >= 1 && nums[mid-1] != target))){
                ans[0] = mid;
                break;
            }
            if(target <= nums[mid]){
                hi = mid -1;
            }
            else {
                lo = mid+1;
            }
            
        }
        lo = 0;
        hi= nums.length -1;
        //Deal with right side now. 
        while(lo <=hi){
            int mid = (lo+hi)/2;
            if(nums[mid] == target && (mid == nums.length -1  || (mid + 1 < nums.length  && nums[mid+1] != target))){
                ans[1] = mid;
                break;
            }
            if(target >= nums[mid]){
                lo = mid+1;
            }
            else {
                hi = mid - 1;
            }
            
        }
        return ans;
        
    }
}
