/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> orders = new ArrayList<>();
        traversalHelper(root, orders);
        return orders;
    }
    private void traversalHelper(TreeNode node, List<Integer> orders){
        if(node==null) return;
        orders.add(node.val);
        traversalHelper(node.left, orders);
        traversalHelper(node.right, orders);
        
    }
}