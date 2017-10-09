/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SolutionSwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(prev.next != null && prev.next.next != null){
            ListNode n0 = prev.next; 
            ListNode n1 =  prev.next.next;
            ListNode next = n1.next;
            prev.next = n1;
            n1.next = n0;
            n0.next = next;
            prev = n0;
        }
        return dummy.next;
    }
}