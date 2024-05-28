/**
 * leetcode problem no :- 622
 * 
 * leetcode solution link (https://leetcode.com/problems/design-circular-queue/)
 */

class MyCircularQueue {
    constructor(k) {
        this.arr = new Array(k);
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    enQueue(value) {
        if (this.size === this.arr.length) {
            return false;
        }
        if (this.size === 0) {
            this.front = this.rear = 0;
            this.arr[0] = value;
        } else if (this.rear < this.arr.length - 1) {
            this.arr[++this.rear] = value;
        } else if (this.rear === this.arr.length - 1) {
            this.rear = 0;
            this.arr[0] = value;
        }
        this.size++;
        return true;
    }

    deQueue() {
        if (this.size === 0) {
            return false;
        }
        if (this.front === this.arr.length - 1) {
            this.front = 0;
        } else {
            this.front++;
        }
        this.size--;
        return true;
    }

    Front() {
        if (this.size === 0) {
            return -1;
        }
        return this.arr[this.front];
    }

    Rear() {
        if (this.size === 0) {
            return -1;
        }
        return this.arr[this.rear];
    }

    isEmpty() {
        return this.size === 0;
    }

    isFull() {
        return this.size === this.arr.length;
    }
}

// Example usage:
let obj = new MyCircularQueue(3);
console.log(obj.enQueue(1)); // true
console.log(obj.enQueue(2)); // true
console.log(obj.enQueue(3)); // true
console.log(obj.enQueue(4)); // false, queue is full
console.log(obj.Rear());     // 3
console.log(obj.isFull());   // true
console.log(obj.deQueue());  // true
console.log(obj.enQueue(4)); // true
console.log(obj.Rear());     // 4
console.log(obj.Front());    // 2
console.log(obj.isEmpty());  // false
console.log(obj.isFull());   // true
