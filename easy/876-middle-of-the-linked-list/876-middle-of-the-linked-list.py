class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

# fast solution through two pointers
class Solution(object):
    def middleNode(self, head):
        slow = head
        fast = head
        while fast != None and fast.next !=None:
            slow = slow.next
            fast = fast.next.next
        return slow

# slow solution through counting the length of the linked list
class Solution(object):
    def middleNode(self, head):
        pointer = head
        length = 0
        while pointer != None:
            pointer = pointer.next
            length +=1

        middle_node = length // 2

        pointer = head
        for i in range(middle_node):
            pointer = pointer.next

        return pointer