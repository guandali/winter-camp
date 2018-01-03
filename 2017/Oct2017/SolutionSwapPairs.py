# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class SolutionSwapPairs(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        dummy = ListNode(0);
        dummy.next = head;
        prev = dummy;
        while(prev.next is not None and prev.next.next is not None):
            n0 = prev.next;
            n1 = prev.next.next;
            next = n1.next;
            prev.next = n1;
            n1.next = n0;
            n0.next = next;
            prev = n0;
        return dummy.next;
            
            
            
           
        