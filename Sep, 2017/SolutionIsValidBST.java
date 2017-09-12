/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionIsValidBST {
    public boolean isValidBST(TreeNode root) {
        TreeNode pre = null;
        Stack<TreeNode> st = new Stack<TreeNode>();
        while(root != null || !st.isEmpty()){
            while(root != null ){
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            if(pre != null && pre.val >= root.val) return false;
            pre = root;
            root = root.right;
        }
       return true;
        
    }
}