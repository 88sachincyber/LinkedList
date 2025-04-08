class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    
    def insert_at_end(self,data):
        new_Node = Node(data)
        if self.head is None:
            self.head = new_Node
            return
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = new_Node

    def deleteAtBegin(self):
        if self.head is None:
            return
        self.head = self.head.next
    
    def deleteAtEnd(self):
        if self.head is None:
            return
        temp = self.head
        while temp.next.next:
            temp = temp.next
        temp.next = None

    def print_list(self):
        curr_node = self.head
        while curr_node:
            print(curr_node.data, end=" -> ")
            curr_node = curr_node.next

if __name__ == "__main__":
    list  = LinkedList();
    for i in range(1,6):
        list.insert_at_end(i)
    
    list.print_list()
    # list.delete()
    list.deleteAtEnd()
    list.print_list()