/**
 * 
 * leetcode problem no :(701)
 * 
 * leetcode solution ()
 */

import javax.swing.tree.TreeNode;

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

 public class insertintoBinaryTree {
     int val;
     insertintoBinaryTree left;
     insertintoBinaryTree right;
     insertintoBinaryTree() {}
     insertintoBinaryTree(int val) { this.val = val; }
     insertintoBinaryTree(int val, insertintoBinaryTree left, insertintoBinaryTree right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
class Solution {
    private insertintoBinaryTree f(insertintoBinaryTree root , int val){
        if(root == null){
            return new insertintoBinaryTree(val);
        }

        if( root.val > val){
            // value can only live in the left subtree
            root.left = f(root.left , val);
        }else{
            // value is only live in the right
            root.right = f(root.right , val);
        }
        return root;
    }
    public insertintoBinaryTree insertIntoBST(insertintoBinaryTree root, int val) {
        return f(root , val);
        
    }
}
 }