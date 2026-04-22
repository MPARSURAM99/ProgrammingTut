public class LinkedList{
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;
    Node tail;

    public void insertData(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void displayData() {
        Node temp = head;

        if (temp == null) {
            System.out.println("Linkedlist is empty.");
        }
        
        while (head != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertData(10);
        ll.insertData(20);
        ll.insertData(30);
        ll.insertData(40);
        ll.insertData(50);

        ll.displayData();
    }
}