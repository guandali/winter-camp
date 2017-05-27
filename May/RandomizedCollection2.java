import java.util.concurrent.ThreadLocalRandom;
public class RandomizedCollection2 {
    List<Integer> list;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        list = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
      boolean ans = ! list.contains(val);
      list.add (val);
      return ans;
        
        
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
       return list.remove(Integer.valueOf(val));
        
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        int min = 0;
        int max = list.size();
        int num =  ThreadLocalRandom.current().nextInt(min, max);
        return list.get(num);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
