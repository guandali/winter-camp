/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SolutionForMergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){ return l2;}
        if(l2 == null){ return l1;}
        ListNode head ;
        ListNode i = head;
        while (l1 != null && l2 != null ){
            if(l1.val > l2.val){
                head.val = l2.val;
                l2 = l2.next;
            }
            else {
                head.val = l1.val;
                l1 = l1.next;
            }
            i = i.next; 
    }
    if (l1 == null && l2 != null ){
        i.val = l2.val;
        l2 = l2.next;
        i.next = l2;
    }
    else  if (l1 != null && l2 == null ){
        i.val = l1.val;
        l1 = l1.next;
        i.next = l1;
    }
    return head;
    
}

}