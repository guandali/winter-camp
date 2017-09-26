/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionPostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        helper(root, ans);
        return ans;
        
    }
    private void helper(TreeNode node, List<Integer> ans){
        if(node == null) return;
        helper(node.left, ans);
        helper(node.right, ans);
        ans.add(node.val);
        
    }
}