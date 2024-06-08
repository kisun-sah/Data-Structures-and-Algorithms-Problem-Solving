import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * leetcode problem no : 145
 * 
 * leetocd solution link (https://leetcode.com/problems/binary-tree-postorder-traversal/)
 */

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
public class PostorderTraversel {
        public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> result = new LinkedList  <> ();
        if(root == null)
         return result;

         Stack<TreeNode> stack = new Stack <> ();
         stack.push(root);

         while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            result.add(curr.val);
            if(curr.left != null)
            stack.push(curr.left);

            if(curr.right != null)
            stack.push(curr.right);

         }
         // Reverse the result list to get the correct postorder traversal
        Collections.reverse(result);
        return result;
    }
}
