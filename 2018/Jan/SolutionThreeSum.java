class SolutionThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> validGroups = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            while(i>0&&nums[i]==nums[i-1]&&i<nums.length-2) i++;
            int target = 0 - nums[i];
            int j = i+1;
            int k = nums.length - 1;
            while(j<k){
                if(nums[j]+nums[k]==target){
                    validGroups.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k]>target) k--;
                else j++;
                while(j>i+1&&nums[j]==nums[j-1]&&j<k) j++;
                while(k<nums.length-1&&nums[k]==nums[k+1]&&k>j) k--;
            }
        }
        return validGroups;
    }
}