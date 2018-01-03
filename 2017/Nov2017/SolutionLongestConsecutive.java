/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionLongestConsecutive {
    int maxLen = 1;
    public int longestConsecutive(TreeNode root) {
        if(root == null) return 0;
        longestConsecutiveHelper(root, Integer.MAX_VALUE);
        return this.maxLen;
    }
    private int longestConsecutiveHelper(TreeNode node, int target){
        if (node == null) return 0;
        if(node != null && node.val != target){
            int leftVal = longestConsecutiveHelper(node.left, node.val + 1) + 1;
            int rightVal = longestConsecutiveHelper(node.right, node.val + 1) + 1;
            int localMax = Math.max(leftVal,rightVal);
            maxLen = Math.max(localMax, maxLen);
            return 0;
        }
        else{
            return Math.max(longestConsecutiveHelper(node.left, target+1),
                            longestConsecutiveHelper(node.right , target+1)
                           ) + 1;
        }
        
        
    }
}