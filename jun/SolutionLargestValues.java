/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionLargestValues {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        helper(root, ans, 0);
        return ans;
        
    }
    
    public void helper(TreeNode node, List<Integer> list, int level){
        if(node == null){
            return;
        }
        if(level == list.size()){
            list.add(node.val);
        }
        else {
            list.set(level, Math.max(node.val, list.get(level)));
        }
        helper(node.left, list, level + 1);
        helper(node.right, list, level + 1 );
        
        return;
        
    }
}