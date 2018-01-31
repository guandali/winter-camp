class SolutionMaxDistance {
    public int maxDistance(List<List<Integer>> arrays) {
        int lo0 = Integer.MAX_VALUE;
        int lo0_idx = -1;
        int lo1 = Integer.MAX_VALUE;
        int lo1_idx = -1;
        int hi0 = Integer.MIN_VALUE;
        int hi0_idx = -1;
        int hi1 = Integer.MIN_VALUE;
        int hi1_idx = -1;
        for(int idx=0; idx<arrays.size();idx++){
            List<Integer> tmp = arrays.get(idx);
            if(tmp.size()<1) continue;
            int lo = tmp.get(0);
            int hi = tmp.get(tmp.size()-1);
            if(lo<lo1){
                if(lo<lo0){
                    lo1 = lo0;
                    lo1_idx = lo0_idx;
                    lo0 = lo;
                    lo0_idx = idx;
                }
                else {
                    lo1 = lo;
                    lo1_idx = idx;
                }
            }
            if(hi>hi0){
                if(hi>hi1){
                    hi0 = hi1;
                    hi0_idx = hi1_idx;
                    hi1 = hi;
                    hi1_idx = idx;
                }
                else{
                    hi0 = hi;
                    hi0_idx = idx;
                }
            }
        }
        int maxDiff = hi1 - lo0;
        if(hi1_idx == lo0_idx){
            maxDiff = Math.max(hi1 - lo1, hi0 - lo0);
        }
        return maxDiff;
        
    }
}