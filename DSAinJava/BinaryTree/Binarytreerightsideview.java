/**
 * leetcode problem nu : 199
 * 
 * leetcode link(https://leetcode.com/problems/binary-tree-right-side-view/)
 */

 import java.util.*;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int val) { this.val = val; }
 }
 
 public class Binarytreerightsideview {
     public List<Integer> rightSideView(TreeNode root) {
         List<Integer> result = new ArrayList<>();
         if (root == null)
             return result;
 
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
 
         while (!queue.isEmpty()) {
             int n = queue.size();
             TreeNode rightNode = null;
 
             for (int i = 0; i < n; i++) {
                 rightNode = queue.poll();
 
                 if (rightNode.left != null)
                     queue.add(rightNode.left);
                 if (rightNode.right != null)
                     queue.add(rightNode.right);
             }
             result.add(rightNode.val);
         }
         return result;
     }
 
     public static void main(String[] args) {
         // Example usage:
         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         root.left.right = new TreeNode(5);
         root.right.right = new TreeNode(4);
 
         Binarytreerightsideview sol = new Binarytreerightsideview();
         List<Integer> rightView = sol.rightSideView(root);
         System.out.println(rightView);  // Output: [1, 3, 4]
     }
 }
 