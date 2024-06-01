package Queue;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    boolean isEmpty() {
        return this.head == null;
    }

    void addAtHead(int data) {
        if (this.isEmpty()) {
            Node newNode = new Node(data);
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node newNode = new Node(data);
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
    }

    void addAtTail(int data) {
        if (this.isEmpty()) {
            this.addAtHead(data);
        } else {
            Node newNode = new Node(data);
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
    }

    void removeAtHead() {
        if (this.isEmpty()) {
            return;
        } else if (this.head.next == null) {
            this.head = null;
            this.tail = null;
        } else {
            Node newHead = this.head.next;
            this.head.next = null;
            newHead.prev = null;
            this.head = newHead;
        }
    }

    void removeAtTail() {
        if (this.isEmpty()) {
            return;
        } else if (this.head.next == null) {
            this.head = null;
            this.tail = null;
        } else {
            Node newTail = this.tail.prev;
            this.tail.prev = null;
            newTail.next = null;
            this.tail = newTail;
        }
    }

    void removeNode(Node node) {
        if (node.prev == null) {
            this.removeAtHead();
        } else if (node.next == null) {
            this.removeAtTail();
        } else {
            Node prevNode = node.prev;
            Node nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            node.prev = null;
            node.next = null;
        }
    }

    void display() {
        // head to tail
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println("*******");

        // tail to head
        temp = this.tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
}

public class DLL {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addAtHead(10);
        dll.addAtHead(9);
        dll.addAtHead(8);
        dll.addAtTail(11);
        dll.addAtTail(12);
        dll.removeAtHead();
        dll.removeAtTail();
      
      
        dll.display(); // Expected output: No nodes, so no output
    }
}
