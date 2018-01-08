/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionIsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricHelper(root, root);
    }
    private boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left==null&&right==null) return true;
        else if((left==null||right==null)||left.val!=right.val) return false;
        else return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
        
    }
}