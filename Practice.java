import java.util.Scanner;

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

    public void addLast(int data) {
        Node newn = new Node(data);
        if (head == null) {
            head = newn;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newn;
    }

    // Find the second largest elemnt from linked list
    public int secEle() {
        Node temp = head;
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        while (temp != null) {
            if (temp.data > f) {
                s = f;
                f = temp.data;
            } else if (temp.data > s && temp.data != f) {
                s = temp.data;
            }
            temp = temp.next;
        }

        if (s == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found");
        }

        return s;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Practice {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Linked List");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element ");
            int ele = sc.nextInt();
            list.addLast(ele);
        }
        // list.addLast(10);
        // list.addLast(20);
        // list.addLast(30);
        // list.addLast(50);
        // list.print();
        System.out.println(list.secEle());
    }

}