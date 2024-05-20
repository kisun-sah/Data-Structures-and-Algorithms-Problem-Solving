import java.util.*;
/**
 * leetcode problem no :- 203
 * 
 * leetcode solution link (https://leetcode.com/problems/remove-linked-list-elements/)
 */

public class RemoveLinklistElement {

    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return head;

        }
        ListNode temp = head;
        while(temp.next  != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }

        }
        return head;
    }
    
    
}
