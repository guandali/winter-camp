class TwoSum {
    Map<Integer, Boolean> entries = new HashMap<>();

    /** Initialize your data structure here. */
    public TwoSum() {
        
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(entries.containsKey(number)) entries.put(number, true);
        else entries.put(number,false);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        boolean existPair = false;
        for(int tmp:this.entries.keySet()){
            if((value-tmp!=tmp||entries.get(tmp))&&this.entries.containsKey(value-tmp)){
                existPair = true;
                break;
            }
        }
        return existPair;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */