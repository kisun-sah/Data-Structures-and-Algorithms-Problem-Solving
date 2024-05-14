/**
 * leetcode problem no:2095
 * solution link(https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)
 */
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteMiddle = function(head) {

    let  prevslow = null;
      let slow = head;
      let fast = head;

      while (fast != null && fast.next != null) {
          prevslow = slow;
          slow = slow.next;
          fast = fast.next.next;
      }
  if (prevslow == null) {
          return null;
      }

      prevslow.next = slow.next;
      // Assuming slow is not needed elsewhere, no need to explicitly delete it in Java
      // Java's garbage collector will take care of memory management
      // delete(slow);

      return head;
  
};