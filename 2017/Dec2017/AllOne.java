class AllOne {
    private int i = 0;
    private Map<String,Integer> freqs = new HashMap<String,Integer>();
    private TreeMap<Integer,Set<String>> sorted = new TreeMap<Integer,Set<String>>();
    /** Initialize your data structure here. */
    public AllOne() {
        
    }
    
    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        if(freqs.containsKey(key)){
            int val = freqs.get(key);
            Set<String> newSet = sorted.getOrDefault(val+1, new HashSet<String>());
            newSet.add(key);
            sorted.put(val+1, newSet);
            Set<String> oldSet = sorted.get(val);
            oldSet.remove(key);
            if(oldSet.isEmpty()){
                sorted.remove(val);
            }
            freqs.put(key, val+1);
        }
        else {
            freqs.put(key, 1);
            Set<String> tmp = sorted.getOrDefault(1, new HashSet<String>());
            tmp.add(key);
            sorted.put(1, tmp);
        }
    }
    
    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        if(!freqs.containsKey(key)) return;
        int val = freqs.get(key);
        Set<String> set = sorted.get(val);
        set.remove(key);
        if(set.isEmpty()) sorted.remove(val);
        if(val==1) freqs.remove(key);
        else {
            set = sorted.getOrDefault(val-1, new HashSet<String>());
            set.add(key);
            sorted.putIfAbsent(val-1, set);
            freqs.put(key,val-1);
        }
        
    }
    
    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        if(sorted.isEmpty()) return "";
        Set<String> tmp = sorted.get(sorted.lastKey());
        Iterator it = tmp.iterator();
        return (String)it.next();
        
    }
    
    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        if(sorted.isEmpty()) return "";
        Set<String> tmp = sorted.get(sorted.firstKey());
        Iterator it = tmp.iterator();
        return (String)it.next();
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */