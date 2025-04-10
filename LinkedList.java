import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    public void insertAtBeginning(int data) {
        Node newn = new Node(data);
        newn.next = head;
        head = newn;
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

    public void insertAtPossition(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int i = 1;

        while (temp != null && i < pos - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        // list.insertAtBeginning(2);
        // list.insertAtBeginning(4);
        // list.insertAtEnd(12);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(40);
        list.insertAtPossition(30, 4);
        list.print();
    }

}
