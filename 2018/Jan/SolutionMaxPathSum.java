/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionMaxPathSum {
    private int maxVal = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sumHelper(root);
        return this.maxVal;
    }
    
    private int sumHelper(TreeNode node){
        if(node==null) return 0;
        int left = sumHelper(node.left);
        int right = sumHelper(node.right);
        int maxChildPath = Math.max(left, right);
        maxChildPath = (maxChildPath>0)?(maxChildPath):(0);
        this.maxVal = Math.max(this.maxVal, node.val+left+right);
        this.maxVal = Math.max(maxChildPath+ node.val, this.maxVal);
        return maxChildPath + node.val;
    }
}