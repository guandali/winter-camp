/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionLowestCommonAncestor {
    private int val0;
    private int val1;
    
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        val0 = Math.min(q.val, p.val);
        val1 = Math.max(q.val, p.val);
        
        return lcaHelper(root);
    }
    
    private TreeNode lcaHelper(TreeNode n){
        if(n == null){
            return null;
        }
        int val = n.val;
        if(val >= val0 && val <= val1){
            return n;
        }
        else if(val > val1){
            return lcaHelper(n.left);
        }
        else {
            return lcaHelper(n.right);
        }
    }
}
