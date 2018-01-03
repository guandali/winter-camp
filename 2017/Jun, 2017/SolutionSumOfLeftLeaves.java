/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionSumOfLeftLeaves {
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        helper(true, root.left);
        helper(false, root.right);
        return sum;
    }
    
    private void helper(boolean isLeft, TreeNode n ){
        if(n == null) return;
        helper(true, n.left);
        helper(false, n.right);
        sum += (isLeft && (n.left == null && n.right == null))?(n.val):(0);
        return;
    }
}