/**
 * 
 * Leetcode problem no : 513
 * 
 * Leetcode solution link (https://leetcode.com/problems/find-bottom-left-tree-value/)
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
let MaxDepth ;
let Bottomleft; // result;
function dfs(root , currDepth){
   // if root is null then return null;

   if(root == null){
       return null;
   }
   
   // if the root is not null then check currDept is greater then MaxDepth

    if(currDepth > MaxDepth){
       MaxDepth = currDepth;

       Bottomleft = root.val;
    } 

    // go to left subtree and update currDepth +1
    dfs(root.left , currDepth +1);

    // got to right subtree and update the currDepth +1
    dfs(root.right , currDepth +1);

    return Bottomleft;
}
var findBottomLeftValue = function(root) {
  
   MaxDepth = -1;
   dfs(root , 0);
   return Bottomleft;
   
};