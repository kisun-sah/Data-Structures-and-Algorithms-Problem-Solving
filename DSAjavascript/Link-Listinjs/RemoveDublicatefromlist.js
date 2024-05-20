/**
 * leetcode problem no:- 
 * leetcode solution link (https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
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
var deleteDuplicates = function(head) {
    let curr = head;

    while(curr != null && curr.next != null){

        if(curr.val != curr.next.val){

            curr = curr.next;
        }else{
            let temp = curr.next;
            curr.next = curr.next.next;

            temp = null;
        }
    }
    return head;
};