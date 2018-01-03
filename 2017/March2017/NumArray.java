/**
 * Used sum = sum + nums[count] 
 * Show exceed time limit
 * 
 * 
 */


public class NumArray {
    private int [] nums;
    private int length;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.length = nums.length;
        
    }
    
    public int sumRange(int i, int j) {
        if ((i > j)|| (i>length - 1)||(j>length - 1)||(i<0)||(j<0)){
            return 0;
        }
        int sum = 0;
        for(int count = i; count<=j;count++ ){
            sum += nums[count] ;
        }
        
        return sum;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */