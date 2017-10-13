# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class SolutionAddTwoNumbers(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        st1=[];
        st2=[];
        while l1 is not None or l2 is not None:
            if l1 is not None:
                st1.append(l1.val)
                l1=l1.next
            if l2 is not None:
                st2.append(l2.val)
                l2=l2.next
        remain=0
        tmp=None
        while st1 or st2 or remain !=0:
            n1=0
            n2=0
            if st1:
                n1=st1.pop()
            if st2:
                n2=st2.pop()
            sum=n1+n2+remain
            l3=ListNode(sum%10)
            remain=sum/10
            l3.next=tmp
            tmp=l3
        return tmp
            
        