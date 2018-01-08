class SolutionRotate {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(0, nums.length-1, nums);
        reverse(0, k-1, nums);
        reverse(k, nums.length-1, nums);
        return;
    }
    
    private void reverse(int i, int j, int[]nums){
        while(i<j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
        
    }
}