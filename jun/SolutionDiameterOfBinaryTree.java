/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionDiameterOfBinaryTree {
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        helper(root);
        return max;
        
    }
    
    private int helper(TreeNode n){
        if(n == null){
            return 0;
        }
        int left = helper(n.left);
        int right =  helper(n.right);
        
        max = Math.max(max,  left + right);
        return Math.max(left,  right)+ 1;
        
    }
}