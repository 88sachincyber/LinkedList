class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self,data):
        new_node = Node(data)
        if self.head is None:
            self.head=new_node
            return
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = new_node

    def createLoop(self):
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = self.head.next
    
    def detectAndRemoveCycle(self):
        slow = self.head
        fast = self.head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if(slow == fast):
                print("Loop found")
                break
        else:
            return
        slow = self.head
        if slow == fast:
            while fast.next != slow:
                fast = fast.next
        else:
            while slow.next != fast.next:
                slow = slow.next
                fast= fast.next
        fast.next = None
            
    
    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end=" ")
            temp = temp.next

if __name__ == "__main__":
    list = LinkedList()
    list.insert(1)
    list.insert(2)
    list.insert(3)
    list.insert(4)
    list.insert(5)
    list.createLoop()
    list.detectCycle()
    list.display()
