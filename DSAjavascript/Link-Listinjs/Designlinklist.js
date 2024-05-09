/**
 * leetcode problem no : 720
 * 
 * leetcode solution link()
 * 
 */

class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
var MyLinkedList = function() {
    this.head =null
    this.tail =null
    this.length = 0;
};

/** 
 * @param {number} index
 * @return {number}
 */
MyLinkedList.prototype.get = function(index) {
    if(index < 0 || index >= this.length) return -1
    let currNode = this.head
    let i = 0
    while(i != index){
        currNode = currNode.next
        i++
    }
    return currNode.val
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtHead = function(val) {
    const newNode = new Node(val)
    if(!this.length){
        this.head = newNode
        this.tail = newNode
    }else{
        newNode.next = this.head
        this.head.prev = newNode
        this.head = newNode
    }
    this.length++
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtTail = function(val) {
    const newNode = new Node(val)
    if(!this.length){
        this.head = newNode
        this.tail = newNode
    }else{
        newNode.prev = this.tail
        this.tail.next = newNode
        this.tail = newNode
    }
    this.length++
};

/** 
 * @param {number} index 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtIndex = function(index, val) {
    if(index < 0 || index > this.length) return
    if (index === 0){
        this.addAtHead(val)
    } else if(index == this.length) {
        this.addAtTail(val)
    }else{
        let newNode = new Node(val)
        let currNode = this.head
        let i = 0
        while(i != index){
            currNode = currNode.next
            i++
        }
        newNode.prev = currNode.prev
        newNode.next = currNode
        currNode.prev.next = newNode
        currNode.prev = newNode
        this.length++
    }

};

/** 
 * @param {number} index
 * @return {void}
 */
MyLinkedList.prototype.deleteAtIndex = function(index) {
    if(index < 0 || index >= this.length) return
    if (index === 0) {
        if(this.length === 1){
            this.head = null
            this.tail = null
        }else{
            this.head = this.head.next;
            this.head.prev = null
        }
    }else if(index === this.length -1){
        this.tail.next = null
        this.tail = this.tail.prev
    }else{
        let currNode = this.head
        let i = 0
        while(i != index){
            
            currNode = currNode.next
            i++
        }
        currNode.prev.next = currNode.next
        currNode.next.prev = currNode.prev
    }
    this.length--
};

/** 
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
 */