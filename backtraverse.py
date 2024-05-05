class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def find_nth_from_end(head, n):
    if not head:
        return None

    slow = fast = head
    
    for _ in range(n):
        if not fast:
            return None  
        fast = fast.next

   
    while fast and fast.next:
        slow = slow.next
        fast = fast.next

    return slow.val

head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(144)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)

n = 2
result = find_nth_from_end(head, n)
print(result)  # Output: 4
