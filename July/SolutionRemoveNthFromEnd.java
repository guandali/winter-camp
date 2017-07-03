/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SolutionRemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0) return null;
        int count = 1;
        ListNode fast = head;
        while(count != n ){
            count++;
            fast = fast.next;
        }
        ListNode slow = head;
        ListNode prev = null;
        while(fast.next != null){
            prev = slow;
            fast = fast.next;
            slow = slow.next;      
        }
        if(prev != null) prev.next = slow.next;
        if(slow == head ){
            if(head != null){
                head = head.next;
            }
            else {
                head = null;
            }
        }
        slow = null;
        return head;
        
        
    }
}