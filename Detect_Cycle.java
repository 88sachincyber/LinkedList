class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean detectCycle() {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.data == fast.data) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }
}

public class Detect_Cycle {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        // list.head.next.next.next.next = list.head;
        System.out.println(list.detectCycle());
    }
}
