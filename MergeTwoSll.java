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
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void merge(LinkedList list1, LinkedList list2){
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        while(temp1.next != null){
            temp1 = temp1.next;
        }
        temp1.next = temp2;
    }

    public void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class MergeTwoSll {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.insertAtEnd(1);
        list1.insertAtEnd(2);
        list1.insertAtEnd(3);
        list2.insertAtEnd(4);
        list2.insertAtEnd(5);
        list2.insertAtEnd(6);
        list1.merge(list1, list2);
        list1.print();
    }
}
