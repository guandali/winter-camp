/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SolutionAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =  0;
        int sum = 0;
        ListNode head = null;
        ListNode cur = head;
        while(l1 != null || l2 != null || carry != 0){
            int val1 = (l1 == null)?(0):(l1.val);
            int val2 = (l2 == null)?(0):(l2.val);
            l1 = (l1 == null)?(null):(l1.next);
            l2 = (l2 == null)?(null):(l2.next);
            
            int val = val1 + val2 + carry;
            //Update carry
            carry = (val - 10 >= 0 )?(1):(0);
            val = (val -10 >= 0)?(val -10):(val);
            
            cur.next = new ListNode(val);
            cur = cur.next;
            
        }
        
        return head.next;
        
    }
}
