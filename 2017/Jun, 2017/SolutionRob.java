/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionRob {
    public int rob(TreeNode root) {
        return helper(root, false);
        
        
    }
    
    private int helper(TreeNode n, boolean added){
        int sum = 0;
        if(n == null) return sum;
        if(added){
            sum = helper(n.left, false) + helper(n.right, false);
        }
        else{
            sum = Math.max(helper(n.left, false) + helper(n.right, false), helper(n.left, true) + helper(n.right, true) + n.val);
        }
        return sum;
        
        
    }
}