class SolutionFindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                if(nums[nums[i]-1] == nums[i]) answer[0] = nums[i];
                else{
                    int tmp = nums[nums[i] -1];
                    nums[nums[i] -1] = nums[i];
                    nums[i] = tmp;
                    i--;
                }
            }
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i] != i+1){
                answer[1] = i+1;
                break;
            }
        }
        return answer;
    }
}