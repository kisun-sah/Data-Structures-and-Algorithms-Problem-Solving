package Queue;
import java.util.ArrayList;

/** 
 * leetcode problem no 1670
 * solution link(https://leetcode.com/problems/design-front-middle-back-queue/)
 */


 class FrontMiddleBackQueue {
    private ArrayList<Integer> queue;

    public FrontMiddleBackQueue() {
        this.queue = new ArrayList<>();
    }

    public void pushFront(int val) {
        this.queue.add(0, val);
    }

    public void pushMiddle(int val) {
        int middle = this.queue.size() / 2;
        this.queue.add(middle, val);
    }

    public void pushBack(int val) {
        this.queue.add(val);
    }

    public int popFront() {
        if (this.queue.isEmpty()) return -1;
        return this.queue.remove(0);
    }

    public int popMiddle() {
        if (this.queue.isEmpty()) return -1;
        int middle = this.queue.size() / 2;
        if (this.queue.size() % 2 == 0) middle--;
        return this.queue.remove(middle);
    }

    public int popBack() {
        if (this.queue.isEmpty()) return -1;
        return this.queue.remove(this.queue.size() - 1);
    }

    public static void main(String[] args) {
        // Example usage:
        FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
        obj.pushFront(1);
        obj.pushMiddle(2);
        obj.pushBack(3);
        System.out.println(obj.popFront());  // Output: 1
        System.out.println(obj.popMiddle()); // Output: 2
        System.out.println(obj.popBack());   // Output: 3
    }
}
