public class SolutionMoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length -1;
        int newLen = 0;
        for(int i =0; i <= len; i++){
            if(nums[i] != 0){
                nums[newLen++] = nums[i];
            }
        }
        
        int start = newLen;
        while(start <= len){
            nums[start++] = 0;
        }
        
        return;
        
    }
}