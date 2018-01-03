/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class SolutionDetectCycle {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode ans = null;
        while(head != null){
            if(set.contains(head)) {
                ans = head;
                break;
            }
            set.add(head);
            head = head.next;
        }
        return ans;
        
    }
}