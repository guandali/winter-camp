/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionBinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<String>();
        String temp = "";
        helper(ans, temp, root);
        return ans;
        
        
    }
    
    public void helper(List<String> ans, String str, TreeNode node){
        if(node == null){
            return;
        }
        
        if(str.equals("")){
          str =  str + node.val;    
        }
        else {
          str = str + "->" + node.val;
        }
        if(node.left == null && node.right == null){
            ans.add(new String(str));
            return;
        }
        helper(ans, str,  node.right );
        helper(ans, str,  node.left );
        
        
    }
    
    
}