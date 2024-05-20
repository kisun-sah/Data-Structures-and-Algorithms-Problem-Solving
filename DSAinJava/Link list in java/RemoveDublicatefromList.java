/**
 * leetcode problem no:- 
 * leetcode solution link (https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
 */
public class RemoveDublicatefromList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while(curr != null && curr.next != null){

            if(curr.val == curr.next.val){

                curr.next = curr.next.next;

            }else{

                curr =  curr.next;
            }
        }
        return head;
        
    }
    
}
