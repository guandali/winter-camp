/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SolutionPartition {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(-1);
        ListNode curLeft = left;
        ListNode right = new ListNode(-1);
        ListNode curRight = right;
        while(head!=null){
            if(head.val>=x){
                curRight.next = head;
                curRight = curRight.next;
            }
            else {
                curLeft.next = head;
                curLeft = curLeft.next;
            }
            head = head.next;
        }
        curLeft.next = right.next;
        curRight.next = null;
        return left.next;
    }
}