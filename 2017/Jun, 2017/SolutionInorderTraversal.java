tion for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionInorderTraversal {
    List<Integer> ans; 
    public List<Integer> inorderTraversal(TreeNode root) {
        ans  = new ArrayList<Integer>();
         traversalHelper(root);
         return ans;
        
    }
    public void traversalHelper(TreeNode node){
        if(node == null){
            return;
        }
        traversalHelper(node.left);
        ans.add(node.val);
        traversalHelper(node.right);
        return;
    }
}
