class SolutionFindRelativeRanks {
    class Rank{
       public int index =-1;
       public int scores = 0;
       public Rank(int index,int scores ){
           this.index = index;
           this.scores = scores;
       }
    }
    class RankComparator implements Comparator<Rank> {
        @Override
        public int compare(Rank r0, Rank r1){
            return r1.scores - r0.scores;
        }
        
    }
    public String[] findRelativeRanks(int[] nums) {
        String [] ans = new String[nums.length];
        RankComparator rankComparator =  new RankComparator();
        PriorityQueue<Rank> pq = new PriorityQueue<Rank>(nums.length,rankComparator);
        for(int i  = 0; i < nums.length; i++){
            pq.offer(new Rank(i, nums[i]));
        }
        int count = 1; 
        while(!pq.isEmpty()){
            Rank tmp = pq.poll();
            if(count == 1) ans[tmp.index] = "Gold Medal";
            else if(count == 2) ans[tmp.index] = "Silver Medal";
            else if (count == 3) ans[tmp.index] = "Bronze Medal";
            else ans[tmp.index]  = "" + count;
            count++;
        }
        return ans;
        
    }
}