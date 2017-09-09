/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionHasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return helper(root, sum);
    }
    
    private boolean helper(TreeNode node, int remain){
        if(node == null){
           return false;
        }
        else if(node.left == null && node.right == null && remain - node.val == 0) return true;
        else {
            return (helper(node.left, remain - node.val) 
                    ||helper(node.right, remain - node.val));
        }
        
    }
}