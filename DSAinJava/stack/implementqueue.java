
/**
 *  leetcode problem 232
 * 
 * leetcode solution link{https://leetcode.com/problems/implement-queue-using-stacks/}
 */

 import java.util.LinkedList;
 import java.util.Queue;
 
 public class implementqueue {
     private Queue<Integer> queue;
 
     public implementqueue() {
         this.queue = new LinkedList<>();
     }
 
     /**
      * @param x the element to push into the queue
      */
     public void push(int x) {
         this.queue.offer(x);
     }
 
     /**
      * @return the element removed from the front of the queue, or -1 if the queue is empty
      */
     public int pop() {
         if (this.queue.isEmpty()) {
             return -1;
         }
         return this.queue.poll();
     }
 
     /**
      * @return the element at the front of the queue without removing it, or -1 if the queue is empty
      */
     public int peek() {
         if (this.queue.isEmpty()) {
             return -1;
         }
         return this.queue.peek();
     }
 
     /**
      * @return true if the queue is empty, false otherwise
      */
     public boolean empty() {
         return this.queue.isEmpty();
     }
 
     public static void main(String[] args) {
         // Example usage:
         implementqueue obj = new implementqueue();
         obj.push(1);
         obj.push(2);
         System.out.println(obj.peek());    // Output: 1
         System.out.println(obj.pop());     // Output: 1
         System.out.println(obj.empty());   // Output: false
     }
 }
 