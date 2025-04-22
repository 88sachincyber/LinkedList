class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

class Doublyll:
    def __init__(self):
        self.head = None
        self.tail = None

    def add_first(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            self.tail = new_node
            return
        new_node.next = self.head
        self.head.prev = new_node
        self.head = new_node

    def add_last(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            self.tail = new_node
            return
        self.tail.next = new_node
        new_node.prev = self.tail
        self.tail = new_node

    def delete_last(self):
        if self.head is None:
            print("List is empty")
            return
        if self.head.next is None:
            self.head = None
            self.tail = None
            return
        self.tail = self.tail.prev
        self.tail.next = None

    def find_middle(self):
        if self.head is None:
            print("List is empty.")
            return

        slow = self.head
        fast = self.head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

        print("Middle node is:", slow.data)

    def print_list(self):
        temp = self.head
        while temp is not None:
            print(temp.data, end=' ')
            temp = temp.next
        print()


if __name__ == "__main__":
    list = Doublyll()
    list.add_first(10)
    list.add_first(20)
    list.add_first(30)
    list.add_last(60)
    list.add_last(70)
    list.delete_last()
    list.print_list()
    list.find_middle()
