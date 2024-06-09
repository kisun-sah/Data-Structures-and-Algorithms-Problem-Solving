/**
 * leetcode problem no (226)
 * 
 * leetcode solution link ()
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

    private TreeNode  f(TreeNode root){
        if(root == null) return null;

        // please go and invert my left subtree
               f(root.left);
        // please go and invert my right subtree
        f(root.right);

        // invert the complete tree
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;

    }
    public TreeNode invertTree(TreeNode root) {
        f(root);
        return root;
        
    }
}