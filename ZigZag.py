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
    
    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end=" ")
            temp = temp.next

    def zigzag(self):
        curr = self.head
        flag = True
        while curr and curr.next:
            if flag:
                if curr.data > curr.next.data:
                    curr.data, curr.next.data = curr.next.data, curr.data
            else:
                if curr.data < curr.next.data:
                    curr.data, curr.next.data = curr.next.data, curr.data
            
            curr = curr.next
            flag = not flag
        
if __name__ == "__main__":
    list = LinkedList()
    list.insert(1)
    list.insert(2)
    list.insert(3)
    list.insert(4)
    list.insert(5)
    list.zigzag()
    list.display()