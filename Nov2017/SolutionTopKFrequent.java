class SolutionTopKFrequent {
    // [1,2]  k = 1 
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int num:nums){
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>(m.keySet());
        Collections.sort(ans, (e1, e2) -> m.get(e1) == m.get(e2)? e1 - e1: m.get(e2) - m.get(e1) );
        return ans.subList(0, k);
    }
}