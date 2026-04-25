public class DoublyLinkedList {
    Node head;
    Node tail;

    public void addNodeToLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    public void addNodeToFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }
    
    public void displayForward() {
        Node temNode = head;

        while (temNode != null) {
            System.out.println(temNode.data);
            temNode = temNode.next;
        }
    }

    public void displayBackward() {
        Node tempNode = tail;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.previous;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addNodeToLast(10);
        dll.addNodeToLast(20);
        dll.addNodeToLast(30);
        dll.addNodeToLast(40);
        dll.addNodeToLast(50);
        dll.addNodeToLast(60);
        dll.addNodeToLast(70);

        dll.displayForward();

        dll.addNodeToFirst(5);
        System.out.println();


        dll.displayBackward();
    }
    
}

class Node {
    int data;
    Node next;
    Node previous;

    Node(int data) {
        this.data = data;
        next = null;
        previous = null;
    }
}