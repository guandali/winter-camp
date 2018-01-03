/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SolutionAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        while(l1 != null || l2 != null){
            if(l1 != null) {
                a.push(l1.val);
                l1=l1.next;
            }
            if(l2 != null){
                b.push(l2.val);
                l2=l2.next;
            }
            
        }
        int carry = 0;
        ListNode tmp = null;
        while((!a.isEmpty() ||!b.isEmpty()) || carry != 0){
            System.out.println("xxxxxxx carry :" + carry );
            int val1= (a.isEmpty())?(0):(a.pop());
            int val2= (b.isEmpty())?(0):(b.pop());    
            int sum = val1 + val2  + carry;
            int val = (sum < 10)?(sum):(sum %10);
            ListNode l3 = new ListNode(val);
            l3.next=tmp;
            tmp=l3;
            carry=(sum<10)?(0):(sum/10);
        }
        return tmp;   
    }
}