class SolutionLeastBricks {
    public int leastBricks(List<List<Integer>> wall) {
        int maxPassed = 0;
        if(wall == null) return maxPassed;
        //Key: brick count, val: count of overlapped
        Map<Integer, Integer> bricks = new HashMap<>();
        for(List<Integer> tmp:wall){
            int cur = 0;
            for(int i = 0; i < tmp.size() - 1; i++){
                cur +=  tmp.get(i);
                int val = 0;
                    val = bricks.getOrDefault(cur, 0) + 1;
                    maxPassed = Math.max(maxPassed, val);
                    bricks.put(cur, val);
            }
        }
        return wall.size() - maxPassed;
    }
}