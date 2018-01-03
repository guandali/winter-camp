/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionPathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if(root == null && sum == 0) return ans;
        helper(ans, list, sum, root);
        return ans;
        
        
    }
    
    private void helper(List<List<Integer>> ans, List<Integer> list, int remain, TreeNode n){
        //Sum can be negative, no one said it must be postive 
        // if(remain <  0){
        //     return;
        // }
        if(n == null){
            return;
        }
        if(remain == n.val && n.left == null && n.right == null){
            list.add(n.val);
         //   if(!ans.contains(list)){
         //Can conatin duplicate if it from diff branches
                ans.add(new ArrayList<Integer>(list));
          //  }
            
            list.remove(list.size()-1);
            
            return;
        }
        list.add(n.val);
        remain = remain - n.val;
        helper(ans, list, remain, n.left);
        helper(ans, list, remain, n.right);
        list.remove(list.size()-1);
        return;
        
        
        
    }
}