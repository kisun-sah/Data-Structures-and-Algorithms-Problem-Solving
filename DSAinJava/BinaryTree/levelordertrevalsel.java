/**
 * leetcode problem no 102
 * 
 * leetcode solution link (https://leetcode.com/problems/binary-tree-level-order-traversal/)
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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList <> ();
        if(root == null)
        return result;

        Queue<TreeNode> q = new LinkedList <>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> currlevel = new ArrayList  <> ();

            while(size -- >0){
                TreeNode curr = q.poll();
                currlevel.add(curr.val);

                if(curr.left != null)
                q.offer(curr.left);

                if(curr.right != null)
                q.offer(curr.right);

            }
            result.add(currlevel);
        }
        return result;
    }
}