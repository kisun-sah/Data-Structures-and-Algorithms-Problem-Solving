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

class Deque {
    DoublyLinkedList dll;

    Deque() {
        this.dll = new DoublyLinkedList();
    }

    void addAtFront(int data) {
        this.dll.addAtHead(data);
    }

    void addAtBack(int data) {
        this.dll.addAtTail(data);
    }

    void removeAtFront() {
        this.dll.removeAtHead();
    }

    void removeAtBack() {
        this.dll.removeAtTail();
    }

    Integer getBack() {
        if (this.dll.tail != null) {
            return this.dll.tail.data;
        }
        return null;
    }

    Integer getFront() {
        if (this.dll.head != null) {
            return this.dll.head.data;
        }
        return null;
    }
}

public class  dequell  {
    public static void main(String[] args) {
        Deque deque = new Deque();

        System.out.println("Add at front: 1, 2, 3");
        deque.addAtFront(1);
        deque.addAtFront(2);
        deque.addAtFront(3);
        deque.dll.display();

        System.out.println("Add at back: 4, 5");
        deque.addAtBack(4);
        deque.addAtBack(5);
        deque.dll.display();

        System.out.println("Remove at front");
        deque.removeAtFront();
        deque.dll.display();

        System.out.println("Remove at back");
        deque.removeAtBack();
        deque.dll.display();

        System.out.println("Get front: " + deque.getFront());
        System.out.println("Get back: " + deque.getBack());
    }
}
