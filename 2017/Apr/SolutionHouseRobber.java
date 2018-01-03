public class SolutionHouseRobber {
    // public int rob(int[] nums) {
    //     int len = nums.length;
    //     if (len == 0) return 0;
    //     return robHelper(0, len -1 , nums);
    // }
    
    // public  int robHelper(int start, int end, int[] nums){
    //     if (start > end) return 0;
    //     if (start == end) return nums[start];
    //     int var0 = 0;
    //     int var1 = 0;
    //     var0 = nums[start] + robHelper(start + 2, end,  nums);
    //     if(start + 1 <= end){
    //         var1 = nums[start + 1] + robHelper(start + 3, end,  nums);
    //     }
        
    //     if (var0 >= var1) return var0;
    //     return var1;
    // }
        public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int [][]t = new int [len][2];
        t[0][0] = 0;
        t[0][1] = nums[0];
        for(int i = 1; i < len; i++){
                t[i][1] = Math.max(t[i-1][0] + nums[i], t[i-1][1] );
                t[i][0] = t[i-1][1];
        }
        return Math.max(t[len -1 ][1], t[len -1 ][0]);
        
    }


}