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

    public void reverseSubPart(int m, int n) {
        if (head == null || m == n)
            System.out.println("reversal not possible");
        Node dummy = new Node(0);
        dummy.next = head;
        Node pre = dummy;
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        Node next = null;
        for (int i = 0; i < n - m; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        head = dummy.next;
    }
    public void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class ReverseSubPart {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        int m=2;
        int n=4;
        list.reverseSubPart(m,n);
        list.print();
    }
}
