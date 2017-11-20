/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SolutionRotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        int size = 0;
        ListNode first = head;
        while(first != null) {
            size++;
            first = first.next;
        }
        if(size == 0) return head;
        
        if(k > size) k = k % size;
        if(k == 0) return head;
        first = head;
        ListNode end = head;
        ListNode prev = null;
        int diff = 1;
        while(diff <k && (first != null &&first.next != null)){
            first = first.next;
            diff++;
        }
        while(first != null &&first.next != null){
            prev = end;
            first = first.next;
            end = end.next;
        }
        //reached the end, reverse.
        if(first != null && prev != null){
            first.next = head;
            prev.next = null;
        }
        return end;
        
    }
}