class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkList {
    constructor() {
        this.head = null; // head of the link list
        this.tail = null; // tail of the link list 
    }

    isEmpty() {
        return this.head === null;
    }

    getHead() {
        if (this.head == null) return undefined;
        return this.head.data;
    }

    getTail() {
        if (this.tail == null) return undefined;
        return this.tail.data;
    }

    removeAtHead() {
        if (this.head == null) 
            return; // link list is empty
        const newHead = this.head.next; // store a new head
        this.head.next = null; // disconnect the old head from the link list
        this.head = newHead;

        // if head becomes null after removal of all the nodes, the link list is empty
        if (this.head == null) {
            this.tail = null; 
        }
    }

    addAtTail(data) {
        const newNode = new Node(data);
        if (this.head == null) {
            // link list is empty
            this.head = newNode;
            this.tail = newNode;
            return;
        } else {
            this.tail.next = newNode; // attach the new node after the prev tail
            this.tail = newNode; // update the tail property
        }
    }
}

class Queue {
    constructor() {
        this.ll = new LinkList(); // create a brand new empty list
    }

    enqueue(data) {
        this.ll.addAtTail(data);
    }

    dequeue() {
        this.ll.removeAtHead();
    }

    isEmpty() {
        return this.ll.isEmpty();
    }

    front() {
        return this.ll.getHead();
    }

    back() {
        return this.ll.getTail();
    }
}

const qu = new Queue();
qu.enqueue(10);
qu.enqueue(20);
qu.enqueue(30);
console.log(qu.front(), qu.back()); // Expected output: 10 30
qu.dequeue();
console.log(qu.front(), qu.back()); // Expected output: 20 30
qu.dequeue();
console.log(qu.front(), qu.back()); // Expected output: 30 30
