/**
 * leetcode problem no : 515
 * 
 * leetcode solution link ()
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
    public List<Integer> largestValues(TreeNode root) {
          List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int maxVal = Integer.MIN_VALUE; // Initialize max value for the current level

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                maxVal = Math.max(maxVal, curr.val);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            result.add(maxVal);
        }

        return result;
    }
}