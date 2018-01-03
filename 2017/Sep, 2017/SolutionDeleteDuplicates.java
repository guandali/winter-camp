/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SolutionDeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode ans = prev;
        ListNode next = null;
        while(head != null){
            if(head.next != null && head.next.val == head.val){
                next = head.next;
                while(next != null && next.val == head.val) next = next.next;
                prev.next = next;
                head = next;
            }
            else {
                prev = head;
                head = head.next;
            }      
        }
        return ans.next;
    }
}