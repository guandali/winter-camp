/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionLevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        helper(0, ans, root);
        Collections.reverse(ans);
        return ans;
        
    }
    
    private void helper(int level, List<List<Integer>> ans, TreeNode n){
        if(n == null) return;
        while(ans.size() - 1 < level){
            ans.add(new ArrayList<Integer>());
        }
        helper(level + 1, ans, n.left);
        helper(level + 1, ans, n.right);
        ans.get(level).add(n.val);
        return; 
        
    }
}