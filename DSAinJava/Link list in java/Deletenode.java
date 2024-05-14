/**
 * leetcode problem no 237
 * solution lik(https://leetcode.com/problems/delete-node-in-a-linked-list/)
 */
/**
 *  Definition for singly-linked list.
 *  public class ListNode {
    int val;
   ListNode next;
   ListNode(int x) { val = x; }
}
 * @param node
 */






public class Deletenode {
 

    public void deleteNode(ListNode node) {
        ListNode prev =null;

        while(node != null &&  node.next != null){
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
       if(node != null){
        if(prev != null){
            prev.next = null;
        }else{
            node = null;
        }
       }
        
    }
}
    

