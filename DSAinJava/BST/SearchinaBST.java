/**
 * 
 * leetcode problem no : (700)
 * 
 * leetcode solution link (https://leetcode.com/problems/search-in-a-binary-search-tree/)
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

    private TreeNode f(TreeNode root, int val){

        if(root == null)
        return root;

        if(root.val == val){

            return root;

        }else if(root.val > val){

            return f(root.left , val);

        }else if(root.val < val){

            return f(root.right , val);

        }else{
            return null;
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {

        return  f(root , val);

       
        
    }
}