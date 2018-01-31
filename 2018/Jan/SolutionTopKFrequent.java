class SolutionTopKFrequent {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freqs = new HashMap<>();
        for(String word:words){
            freqs.put(word, freqs.getOrDefault(word, 0)+1);
        }
        List<String> tmp = new ArrayList<String>(freqs.keySet());
        Collections.sort(tmp, (s1, s2)->
          (freqs.get(s2)==freqs.get(s1))?(s1.compareTo(s2)):freqs.get(s2)-freqs.get(s1));
        return tmp.subList(0, k);
    }
}