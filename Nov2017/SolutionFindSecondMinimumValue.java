/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionFindSecondMinimumValue {
    private int[] topTwo = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public int findSecondMinimumValue(TreeNode root) {
        findSecondMinimumValueHelepr(root);
        return topTwo[1] == Integer.MAX_VALUE?-1:topTwo[1];
    }
    
    private void findSecondMinimumValueHelepr(TreeNode node){
        if(node == null) return;
        if(node.val < topTwo[1]){
            if(node.val < topTwo[0]) {
                topTwo[1] = topTwo[0];
                topTwo[0] = node.val;
            }
            else if (node.val > topTwo[0]){
                topTwo[1] = node.val;
            }
        }
        findSecondMinimumValueHelepr(node.left);
        findSecondMinimumValueHelepr(node.right);
    }
}