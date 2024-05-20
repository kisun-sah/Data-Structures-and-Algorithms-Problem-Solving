import java.util.*;
/**
 * leetcode problem no:2095
 * solution link(https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)
 */
/**

import java.util.List;

public class DeletetheMiddlenode {
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
    public ListNode deleteMiddle(List head) {
        ListNode prevSlow = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prevSlow == null) {
            return null;
        }

        prevSlow.next = slow.next;
        // Assuming slow is not needed elsewhere, no need to explicitly delete it in Java
        // Java's garbage collector will take care of memory management
        // delete(slow);

        return head;
    }
}

    
}
