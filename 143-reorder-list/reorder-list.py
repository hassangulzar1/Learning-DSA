# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        slow,fast  = head,head.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        
        #reverse Second half
        second = slow.next
        prev = slow.next = None
        while second:
            temp = second.next
            second.next = prev
            prev = second
            second = temp
        #now time to merge two lists
        firstHalf,secondHalf = head,prev
        while secondHalf:
            temp1,temp2 = firstHalf.next,secondHalf.next
            firstHalf.next = secondHalf
            secondHalf.next = temp1
            firstHalf,secondHalf = temp1,temp2
