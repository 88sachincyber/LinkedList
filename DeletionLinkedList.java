package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeletionLinkedList {
    Node head;
    DeletionLinkedList(){
        head = null;
    }
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head= newNode;
            return;
        }
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next=newNode;
    }
    public void deteleAtBeginning(){
        if(head == null){
            return;
        }
        Node temp = head;
        head = head.next;
        temp = null;
    }

    public void deteleAtEnd(){
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp =  temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeletionLinkedList list = new DeletionLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(60);
        //list.deteleAtBeginning();
        list.deteleAtEnd();
        list.print();
    }
}
