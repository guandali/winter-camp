/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionIsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q == null ^ p == null) return false;
        if(q ==null && q== p) return true;
        return p.val == q.val && isSameTree(p.left, q.left) &&  isSameTree(p.right, q.right);
        
    }
}