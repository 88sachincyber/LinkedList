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

    public Node merge(Node list1, Node list2) {
        Node temp = new Node(0);
        Node curr = temp;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next; // ✅ move forward in the merged list
        }
        if (list1 != null) {
            curr.next = list1;
        } else if (list2 != null) {
            curr.next = list2;
        }
        return temp.next;
    }

    public void print(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

public class Merge_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        System.out.println("Enter the size of list1");
        int s1 = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < s1; i++) {
            list1.insertAtEnd(sc.nextInt());
        }

        System.out.println("Enter the size of list2");
        int s2 = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < s2; i++) {
            list2.insertAtEnd(sc.nextInt());
        }

        LinkedList mergedList = new LinkedList();
        Node mergedHead = mergedList.merge(list1.head, list2.head);

        System.out.println("Merged List:");
        mergedList.print(mergedHead);
    }
}
