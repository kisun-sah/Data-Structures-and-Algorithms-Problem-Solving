

/**
 * leetcode problem on (124)
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
    private int maxSum;
    private int solve(TreeNode root){

        //Base case 
        if(root == null){
            return 0;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        int sumThroughRoot = left + right + root.val ; //1

        int sumThroughOneChild = Math.max(left , right) + root.val; //2

        int onlyRootValue = root.val; // 3

        int maxOne = Math.max( Math.max(sumThroughOneChild, onlyRootValue ),sumThroughRoot);
        
        maxSum = Math.max(maxSum, maxOne);

        // improtant part
        return Math.max(sumThroughOneChild ,  onlyRootValue);
    }
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        solve(root);
        return maxSum;
        
    }
}