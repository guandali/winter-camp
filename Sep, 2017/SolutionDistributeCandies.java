class SolutionDistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : candies){
            if(! set.contains(num)) set.add(num);
        }
        return (set.size() >= candies.length /2)?(candies.length /2):(set.size());
        
    }
}