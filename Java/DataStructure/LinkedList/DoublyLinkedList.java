public class DoublyLinkedList {
    Node head;
    Node tail;

    public void addNode(int data) {
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
    
    public void displayForward() {
        Node temNode = head;

        while (temNode.next != null) {
            System.out.println(temNode.data);
            temNode = temNode.next;
        }
    }

    public void displayBackward() {
        Node tempNode = tail;
        while (tempNode.previous != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.previous;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addNode(10);
        dll.addNode(20);
        dll.addNode(30);
        dll.addNode(40);
        dll.addNode(50);
        dll.addNode(60);
        dll.addNode(70);

        dll.displayForward();
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