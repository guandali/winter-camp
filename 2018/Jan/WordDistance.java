class WordDistance {
    private Map<String, TreeSet<Integer>> pos = new HashMap<>();
    public WordDistance(String[] words) {
        for(int i=0; i<words.length;i++){
            TreeSet<Integer> tmp = pos.getOrDefault(words[i], new TreeSet<Integer>());
            tmp.add(i);
            pos.putIfAbsent(words[i], tmp);
        }
    }
    
    public int shortest(String word1, String word2) {
        int minDis = -1;
        if(word1==null||word2==null) return minDis;
        TreeSet<Integer> s1 = pos.get(word1);
        TreeSet<Integer> s2 = pos.get(word2);
        if(s1==null||s2==null) return minDis;
        minDis = Integer.MAX_VALUE;
        if(s1.size()>s2.size()){
            TreeSet<Integer> tmp = s1;
            s1 = s2;
            s2 = tmp;
        }
        for(Integer num:s1){
            Integer hi = s2.higher(num)==null?(Integer.MAX_VALUE):(s2.higher(num)-num);
            Integer lo = s2.lower(num)==null?(Integer.MAX_VALUE):(num-s2.lower(num));
            int tmp = Math.min(hi, lo);
            minDis = Math.min(tmp, minDis);
        }
        return minDis;
        
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */