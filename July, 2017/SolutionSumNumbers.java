/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionSumNumbers {
    public int sumNumbers(TreeNode root) {
        return sumHelper(root,"");
        
    }
    
    private int sumHelper(TreeNode node, String val){
        if(node == null){
            return 0;
        }
        if (node.left == null && node.right == null) return Integer.parseInt(val + node.val);
        
        return sumHelper(node.left, val + node.val) + sumHelper(node.right, val + node.val);
        
    }
}