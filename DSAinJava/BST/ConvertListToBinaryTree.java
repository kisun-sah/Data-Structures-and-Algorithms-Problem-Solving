/**
 * leetcode problem no :(109)
 * 
 * leetcode solution link (https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/)
 * 
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

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// Definitions for ListNode and TreeNode
public class ConvertListToBinaryTree {
    int val;
    ConvertListToBinaryTree next;
    ConvertListToBinaryTree() {}
    ConvertListToBinaryTree(int val) { this.val = val; }
    ConvertListToBinaryTree(int val, ConvertListToBinaryTree next) { this.val = val; this.next = next; }
}


class Solution {
    public ConvertListToBinaryTree calcMid(ConvertListToBinaryTree head , ConvertListToBinaryTree tail){

   
        ConvertListToBinaryTree slow = (ConvertListToBinaryTree) head;
        ConvertListToBinaryTree fast = (ConvertListToBinaryTree) head;

        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


      public TreeNode makeBST(ConvertListToBinaryTree head, ConvertListToBinaryTree tail) {
        if (head == tail) return null;

        ConvertListToBinaryTree mid = calcMid(head, tail);
        TreeNode root = new TreeNode(mid.val);

        root.left = makeBST(head, mid);
        root.right = makeBST(mid.next, tail);

        return root;
    }

    public TreeNode sortedListToBST(ConvertListToBinaryTree head) {
        return makeBST(head , null);
    }
}