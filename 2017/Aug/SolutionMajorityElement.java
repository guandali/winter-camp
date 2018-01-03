public class SolutionMajorityElement {
    public List<Integer> majorityElement(int[] nums) {
            	List<Integer> ans = new ArrayList<Integer>();
    	int can0 = 0, count0 = 0;
    	int can1 = 0, count1 = 0;
    	for(int num:nums){
    		if(count0 == 0 && num != can1){
    			can0 = num;
    			count0 = 1;
    		}
    		else if(count1 == 0 && num != can0){
    			can1 = num;
    			count1 = 1;
    		}
    		else if(can1 == num){
    			count1++;
    		}
    		else if(can0 == num){
    			count0++;
    		}
    		else {
    			count0--;
    			count1--;
    		}
    	}
    	count0 =0;
    	count1 = 0;
    	for(int num : nums){
    	  if(num == can0) count0++;
    	  else if(num == can1) count1++;
    	}
    	if(count0> (nums.length /3)) ans.add(can0);
    	if(count1> (nums.length /3)) ans.add(can1);
    	return ans;
        
    }
}