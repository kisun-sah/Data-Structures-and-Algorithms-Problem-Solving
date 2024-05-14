


/**
 * leetcode problem no:- 19
 * 
 * leetcode solution link(https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/1258096936/)
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode fast = head;
         ListNode slow = head;

         for(int i=0 ; i<n; i++){
            fast = fast.next;
         }

         if(fast == null){
            return head.next;
         }
         while(fast != null && fast.next !=null){

            fast = fast.next;
            slow = slow.next;
         }
         ListNode temp = slow.next;
         slow.next = slow.next.next;
        temp = null;

        return head;
    }
}