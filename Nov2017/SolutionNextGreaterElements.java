class SolutionNextGreaterElements {
    public int[] nextGreaterElements(int[] nums) {
        int[] saved = Arrays.copyOf(nums, nums.length);
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            int newVal = Integer.MAX_VALUE;
            //Search right first
            int j = i+1;
            boolean found = false;
            while(j < nums.length){
                if(saved[j] > nums[i] && saved[j] < newVal){
                    newVal = saved[j];
                    found = true;
                    break;
                }
                j++;
            }
            if(!found){
                j = 0;
                while(j < i){
                    if(saved[j] > nums[i] && saved[j] < newVal){
                        found = true;
                        newVal = saved[j];
                        break;
                    }
                    j++;
                }
                
            }
            nums[i] = (found)?newVal:-1;
        }
        return nums;
    }
}