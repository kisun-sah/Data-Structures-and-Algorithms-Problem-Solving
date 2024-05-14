/**
 * leetcode problem no 237
 * solution lik(https://leetcode.com/problems/delete-node-in-a-linked-list/)
 */
/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} node
 * @return {void} Do not return anything, modify node in-place instead.
 */
var deleteNode = function(node) {
    let prev = null;

    while(node != null && node.next != null){
        node.val = node.next.val;
        prev = node;
        node = node.next;

    }
    if(node !== null){
        if(prev !== null){
            prev.next = null;
        }else{
            node = null;
        }
    }
  
    
};