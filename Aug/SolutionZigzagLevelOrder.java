/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        boolean isReverse = false;
        List<TreeNode> list = new ArrayList<TreeNode>();
        if(root != null) list.add(root);
        helper(list, ans, isReverse);
        return ans;
        
    }
    
    private void helper(List<TreeNode> list, List<List<Integer>> ans, boolean isReverse ){
        if(list.size() == 0) return;
        List<TreeNode> tmp = new ArrayList<TreeNode>();
        List<Integer> values = new ArrayList<Integer>();
        for(TreeNode n : list){
            if(n.left != null) tmp.add(n.left);
            if(n.right != null) tmp.add(n.right);
            values.add(n.val);            
        }
        if(isReverse) Collections.reverse(values);
        ans.add(values);
        isReverse = (isReverse)?(false):(true);
        helper(tmp, ans, isReverse);
        
    }
}