class SolutionSortTransformedArray {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int[] res = new int[nums.length];
        for(int i=0; i< nums.length; i++){
            res[i] = a* nums[i] * nums[i] + b* nums[i] + c;
        }
        Arrays.sort(res);
        return res;
    }
}