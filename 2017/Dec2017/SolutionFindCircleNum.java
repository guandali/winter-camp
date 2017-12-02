class SolutionFindCircleNum {
    public int findCircleNum(int[][] M) {
        int nums[] = new int[M.length];
        Arrays.fill(nums, -1);
        int count = 0;
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M.length; j++){
                if(M[i][j] == 1){
                    int x = find(i, nums);
                    int y = find(j, nums);
                    if(x != y) nums[x] = y;
                }
            }
        }
        for(int num:nums) if(num == -1) count++;
        return count;
    }
    
    private int find(int i, int[] nums){
        if(nums[i] == -1) return i;
        else return find(nums[i], nums);
    }
}