/**
 * leetcode problem no :- 203
 * 
 * leetcode solution link (https://leetcode.com/problems/remove-linked-list-elements/)
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
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {
    while(head != null && head.val == val){
        head = head.next;
    }
    if(head == null){
        return head;
    }
    let temp = head;
    while(temp.next != null){
        if(temp.next.val == val){
            temp.next = temp.next.next;
        }else{
            temp = temp.next;
        }
    }
    return head;
    
};