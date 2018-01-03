class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num:nums){
            counts.put(num, counts.getOrDefault(num, 0)+1);
        }
        List<Integer> entries = new ArrayList<Integer>(counts.keySet());
        Collections.sort(entries, (e1, e2)->
                        counts.get(e1)-counts.get(e2));
        List<Integer> maxElements = new ArrayList<>();
        int num = entries.get(entries.size()-1);
        int freq = counts.get(num);
        for(int i=entries.size()-1; i>=0;i--){
            int tmp = entries.get(i);
            int tmpFreq = counts.get(tmp);
            if(tmpFreq==freq) maxElements.add(tmp);
            else break;
        }
        int minDistance = Integer.MAX_VALUE;
        for(int ele:maxElements){
            int start = -1;
            int end = -1;
            int count = -1;
            for(int i=0; i<nums.length;i++){
                if(nums[i]==ele){
                    if(start==-1){
                        start = i;
                        count = 1;
                    }
                    else count++;
                    if(count==freq){
                        end = i;
                        break;
                    }
                }
            }
            minDistance = Math.min(minDistance, end - start +1);
        }
        return minDistance;
    }
}