/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SolutionSortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode behind = null;
        while(fast.next != null && fast.next.next != null){
            behind = slow;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        TreeNode n = new TreeNode(slow.val);
        if(behind != null) behind.next = null;
        n.left = (head == slow)?(null):(sortedListToBST(head));
        n.right = sortedListToBST(slow.next);
        return n;
        
        
    }
}