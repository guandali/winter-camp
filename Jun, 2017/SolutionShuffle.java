public class SolutionShuffle {
    private int[] nums = null;
    Random r = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
        
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> temp = IntStream.of(nums).boxed().collect(Collectors.toList());;
        int idx = 0;
        int[] ans = new int[nums.length];
        while(idx < nums.length){
            int num = r.nextInt(temp.size());
            ans[idx++] = temp.get(num);
            temp.remove(num);
        }
        
        return ans;
        
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */