/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionInorderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode tmp = null;
        if(root==null) return tmp;
        if(root==p){
            if(root.right==null) return null;
            tmp = root.right;
            while(tmp.left!=null) tmp = tmp.left;
            return tmp;
        }
        else if(root.val>p.val){
            tmp = inorderSuccessor(root.left, p);
            if(tmp==null) return root;
            else return tmp;
        }
        else {
            return inorderSuccessor(root.right, p);
        }
     }
}