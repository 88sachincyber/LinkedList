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

    public void deletenth(int n) {
        Node temp = head;
        int c = 0;
        while (temp != null) {
            temp = temp.next;
            c++;
        }
        if (c == n) {
            head = head.next;
        }
        int i = 1;
        int iToFind = c - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    public Node findMid(Node head) {
        // Node temp = head;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = findMid(head);
        Node curr = mid, prev = null, temp = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of Linked List");
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // System.out.println("Enter the element ");
        // int ele = sc.nextInt();
        // list.addLast(ele);
        // }
        list.addLast(1);
        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        // list.print();
        // System.out.println(list.secEle());
        // list.deletenth(3);
        // list.findMid();
        // list.print();
        System.out.println(list.checkPalindrome());
    }

}