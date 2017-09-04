/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionFlatten {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        
        helper(root);
        return;
    }
    
    public TreeNode helper(TreeNode root){
        if(root == null ) return null;
        TreeNode ln = helper(root.left);
        TreeNode rn = helper(root.right);
        root.left = null;
        if(ln != null){
            root.right = ln;
            while(ln.right != null){
              ln = ln.right;
            }
            ln.right = rn;
        }
        else {
            root.right = rn;
        }
        
        return root;

    }
}