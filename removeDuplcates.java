class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    public void insertAtEnd(int data) {
        Node temp1 = new Node(data);
        if (head == null) {
            head = temp1;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = temp1;
    }

    public void removeDuplicate() {
        Node temp = head;
        while (temp != null) {
            Node curr = temp;
            while (curr.next != null) {
                if (curr.next.data == temp.data) {
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }
            temp = temp.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class removeDuplcates {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.removeDuplicate();
        list.display();
    }
}
