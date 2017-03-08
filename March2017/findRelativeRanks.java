public class findRelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        int len = nums.length;
        String firstPlace = "Gold Medal";
        String secondPlace = "Silver Medal";
        String thirdPlace = "Bronze Medal";
        String [] arr = new String[len];
        Arrays.sort(nums);
        for(int i =0; i<len; i++){
            if(i == 0){
                arr[i] = firstPlace;
            }
            else if (i == 1){
                arr[i] = secondPlace;
            }
            else if (i == 2){
                arr[i] = thirdPlace;
            }
            else {
                arr[i] = Integer.toString(nums[i]);
            }
        }
        return arr;
        
        
    }
}
