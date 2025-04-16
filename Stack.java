class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack1 {
    Node head;

    Stack1() {
        head = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (head == null) {
            return;
        }
        Node temp = head;
        head = head.next;
        temp = null;
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

public class Stack {
    public static void main(String[] args) {
        Stack1 list = new Stack1(); 
        list.push(10);
        list.push(20);
        list.push(30);
        list.display();
        list.pop();
        list.display();
    }
}
