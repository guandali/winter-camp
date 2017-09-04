class SolutionSummaryRanges {
    static String SIGN = "->";
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        int i = 0;
        while(i < nums.length){
            if(i + 1 < nums.length && nums[i] +1  == nums[i+1] ){
                int start = i; 
                int end = i + 1;
                while(end < nums.length && nums[end -1] + 1 == nums[end]) end++;
                end = end - 1;
                ans.add(nums[start] + SIGN + nums[end]);
                i = end + 1;
            }
            else {
                ans.add("" + nums[i] );
                i++;
            }
        }
        return ans;
        
    }
}