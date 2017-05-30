/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SolutiondeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        ListNode ans = head;
        while(cur != null){
            while(cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }
            if(prev!= null){
                prev.next = cur;
            }
            else{
                ans = cur;
            }
            prev = cur;
            cur = cur.next;
        }
        
        return ans;
        
        
        
        
    }
}