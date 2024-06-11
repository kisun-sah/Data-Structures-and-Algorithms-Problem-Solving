/**
 * leetcode problem no : (551)
 * 
 * leetcode solution link (https://leetcode.com/problems/flip-equivalent-binary-trees/)
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

    private boolean f(TreeNode root1, TreeNode root2){
        //BAse case 

        if(root1 == null && root2 == null){
            return true;
        }
        if(root1  == null || root2 == null) {
            // if any root is null or another contain value then , return false
            return false;
        }

        if(root1.val != root2.val ){
            return false;
        }else{
            return (f(root1.left , root2.left)&&f(root1.right , root2.right))
            ||(f(root1.left, root2.right) && f(root1.right, root2.left));
            
        }
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {

        return f(root1 , root2);
        
    }
}