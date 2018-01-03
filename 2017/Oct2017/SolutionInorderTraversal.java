/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionInorderTraversal {
    List<Integer> ans;
    public List<Integer> inorderTraversal(TreeNode root) {
        this.ans = new ArrayList<>();
        helper(root);
        return ans;
    }
    
    private void helper(TreeNode n){
        if(n == null) return; 
        helper(n.left);
        ans.add(n.val);
        helper(n.right);
        
    }
}