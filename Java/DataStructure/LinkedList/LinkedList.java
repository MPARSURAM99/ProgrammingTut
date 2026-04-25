public class LinkedList {
    Node head;
    Node tail;
    
    public String addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            String msg = "One node added successfully!";
            return msg;
        }
        tail.next = newNode;
        tail = newNode;
        String msg = "Node added successfully!";
        return msg;
    }

    public void displayLinkedList() {
        Node temNode = head;
        while (temNode != null) {
            System.out.println(temNode.data);
            temNode = temNode.next;
        }
    }

    public String removeLastNode() {
        Node temNode = head;
        while (temNode.next != tail) {
            temNode = temNode.next;
        }
        temNode.next = null;
        tail = temNode;
        String msg = "Last node deleted successfully!";
        return msg;
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        System.out.println(myList.addNode(10));
        System.out.println(myList.addNode(20));
        System.out.println(myList.addNode(30));
        System.out.println(myList.addNode(40));
        System.out.println(myList.addNode(50));

        myList.displayLinkedList();

        System.out.println(myList.removeLastNode());

        myList.displayLinkedList();

    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}