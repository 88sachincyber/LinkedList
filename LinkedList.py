class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
class LinkedList:
    def __init__(self):
        self.head = None

    
    def insert_at_beginning(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node


    def insert_at_end(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = new_node

    def insert_at_position(self, position, data):
        if position < 0:
            print("Invalid position")
            return

        new_node = Node(data)
        if position == 0:
            new_node.next = self.head
            self.head = new_node
            return

        temp = self.head
        for _ in range(position - 1):
            if temp is None:
                print("Position out of bounds")
                return
            temp = temp.next

        if temp is None:
            print("Position out of bounds")
            return

        new_node.next = temp.next
        temp.next = new_node


    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end=' -> ')
            temp = temp.next
        print("None")

ll = LinkedList()
ll.insert_at_end(10)
ll.insert_at_end(20)
ll.insert_at_beginning(5)
ll.insert_at_position(1, 15)

print("Linked List after insertions:")
ll.display()