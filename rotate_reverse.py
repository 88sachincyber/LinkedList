class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insert_AtEnd(self,data):
        new_node = Node(data) 
        if self.head is None:
            self.head = new_node
            return
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = new_node

    def reverse(self):
        current = self.head
        previous = None
        while current:
            next_node = current.next
            current.next = previous
            previous = current
            current = next_node
        self.head = previous
    
    def rotate(self ,k):
        if not self.head or k ==0:
            return
        curr = self.head
        count = 1
        while curr.next:
            curr = curr.next
            count += 1
        tail = curr
        k = k%count
        if k==0:
            return
        curr = self.head
        for i in range(count-k-1):
            curr = curr.next
        new_head = curr.next
        curr.next = None
        tail.next = self.head
        self.head = new_head
    

    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end=' ')
            temp = temp.next

if __name__ == "__main__":
    l = LinkedList()
    for i in range(1,6):
        l.insert_AtEnd(i)        
    print("Original \n")
    l.display()
    # print("reverse \n")
    # l.reverse()
    # l.display()
    print("Rotated \n")
    l.rotate(2)
    l.display()