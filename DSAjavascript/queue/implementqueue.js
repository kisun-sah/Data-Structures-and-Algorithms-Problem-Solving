
/**
 *  leetcode problem 232
 * 
 * leetcode solution link{https://leetcode.com/problems/implement-queue-using-stacks/}
 */

var MyQueue = function() {
    this.queue = [];
};

/** 
 * @param {number} x
 * @return {void}
 */
MyQueue.prototype.push = function(x) {
    this.queue.push(x);
};

/**
 * @return {number}
 */
MyQueue.prototype.pop = function() {
    if (!this.queue.length) return -1;
    return this.queue.shift();  // Correctly removes and returns the first element
};

/**
 * @return {number}
 */
MyQueue.prototype.peek = function() {
    if (!this.queue.length) return -1;
    return this.queue[0];  // Returns the first element without removing it
};

/**
 * @return {boolean}
 */
MyQueue.prototype.empty = function() {

 // Returns true if the queue is empty, false otherwise
    if(!this.queue.length)return  true;

    return false;
  
};

/** 
 * Your MyQueue object will be instantiated and called as such:
 * var obj = new MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */
