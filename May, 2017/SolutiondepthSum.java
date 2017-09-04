/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class SolutiondepthSum {
    public int depthSum(List<NestedInteger> nestedList) {
        int depth = 1;
        return helper(depth, nestedList);
    }
    public int helper(int depth, List<NestedInteger> nestedList){
        int sum = 0;
        for(NestedInteger e : nestedList ){
            if(e.isInteger()){
                sum = sum + e.getInteger() * depth;
            }
            else {
                sum = sum + helper(depth + 1, e.getList());
            }
        }
        
        return sum;
        
    }
}
