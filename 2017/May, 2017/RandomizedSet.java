import java.util.concurrent.ThreadLocalRandom;
public class RandomizedSet {
    //private HashSet <Integer> set;
    private List<Integer> list;
    /** Initialize your data structure here. */
    public RandomizedSet() {
       // set = new HashSet<Integer>();
        list = new ArrayList<Integer>();
        
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!list.contains(val)){
            return list.add(val);
        }
        else{
            return false;
        }
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
       return list.remove(Integer.valueOf(val));
        
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        // if(list.size() < 1){
        //     return -1;
        // }
        int min = 0; 
        int max = list.size();
        int num =  ThreadLocalRandom.current().nextInt(min, max);
        return list.get(num);
        
    }
}

// [ 2,  ]

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
