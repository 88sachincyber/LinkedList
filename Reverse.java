import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Reverse {
    Node head;

    Reverse() {
        head = null;
    }

    public void insertAtEnd(int data) {
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

    public void reverseStack() {
        if (head == null) {
            return;
        }
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }

    public void reverseStack1() {
        if (head == null) {
            return;
        }
        Stack<Node> st = new Stack<>();
        Node temp = head;
        while (temp!=null) {
            st.push(temp);
            temp = temp.next;
        }
        head = st.pop();
        temp= head;
        while (!st.isEmpty()) {
            temp.next = st.pop();
            temp = temp.next;
        }
        temp.next = null;
    }

    public void reverse(){
        Node curr =head, prev =null, temp;
        while (curr!=null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public void merge(){
        
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
        Reverse list = new Reverse();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        // list.reverseStack();
        // list.reverseStack1();
        list.reverse();
        list.print();
    }
}
