/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionFindBottomLeftValue {
    private int depth = 0;
    public int findBottomLeftValue(TreeNode root) {
        depth = findDepth(root);
        TreeNode ans = helper(root, 1);
        return ans.val;
        
    }
    
    private TreeNode helper(TreeNode n, int curHeight){
        if(n == null) return null;
        if(curHeight == depth) return n; 
        TreeNode l = helper(n.left, curHeight+1);
        TreeNode r = helper(n.right, curHeight+1);
        return (l == null)?((r == null)?(null):(r)):(l);
        
        
    }
    /* Find the max depth/ lastest level
     *
     *
     */
    private int findDepth(TreeNode n){
        if(n == null) return 0;
        else {
            return Math.max(findDepth(n.left),findDepth(n.right) )+1;
        }
    }
}