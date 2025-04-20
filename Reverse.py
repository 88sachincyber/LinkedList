# Node class
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    
    def append(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node

  
    def print_list(self):
        current = self.head
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")

  
    def reverse(self):
        prev = None
        current = self.head
        while current:
            next_node = current.next 
            current.next = prev       
            prev = current           
            current = next_node     
        self.head = prev 

# Example usage
ll = LinkedList()
ll.append(1)
ll.append(2)
ll.append(3)
ll.append(4)

print("Original list:")
ll.print_list()

ll.reverse()

print("Reversed list:")
ll.print_list()
