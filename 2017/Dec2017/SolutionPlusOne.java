/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SolutionPlusOne {
    public ListNode plusOne(ListNode head) {
        int remain = plusHelper(head);
        if(remain > 0){
            ListNode newHead = new ListNode(remain);
            newHead.next = head;
            return newHead;
        }
        else return head;
    }
    
    private int plusHelper(ListNode n){
        int remain = 0;
        if(n == null) return remain;
        if(n.next == null) n.val = n.val + 1;
        else n.val += plusHelper(n.next);
        remain = n.val/10;
        n.val = n.val % 10;
        return remain;
    }
}