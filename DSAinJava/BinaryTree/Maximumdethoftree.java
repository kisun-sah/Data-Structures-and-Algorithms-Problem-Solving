/**
 * leetcode problem no :(104)
 * 
 * leetcode solution link (https://leetcode.com/problems/maximum-depth-of-binary-tree/)
 * 
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
class Solution {
    private int f(TreeNode root){
        if(root == null){
            return 0;
        }
        // if root is not null then ,
       int result = 1+ Math.max(f(root.left) , f(root.right));
         return result;
    }
    public int maxDepth(TreeNode root) {

       return  f(root);
        
    }
}