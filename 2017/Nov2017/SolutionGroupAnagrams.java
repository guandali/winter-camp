class SolutionGroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> m = new HashMap<>();
        List<List<String>> ans = new ArrayList<List<String>>();
        for(String tmp: strs){
            char[] chars = tmp.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(m.containsKey(key)){
                int index =  m.get(key);
                List<String> l = ans.get(index);
                l.add(tmp);
                ans.set(index, l);
            }
            else {
                List<String> nl = new ArrayList<>();
                nl.add(tmp);
                ans.add(nl);
                m.put(key, ans.size()-1);
            }
        }
        return ans;
        
    }
}