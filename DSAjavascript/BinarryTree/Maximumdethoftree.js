/**
 * leetcode problem no :(104)
 * 
 * leetcode solution link (https://leetcode.com/problems/maximum-depth-of-binary-tree/)
 * 
 */

/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
function f(root){
    if(root == null){
        return 0;
    }

   let result = 1 + Math.max(f(root.left) , f(root.right));
   return result;
 }
var maxDepth = function(root) {
    return f(root);
    
};