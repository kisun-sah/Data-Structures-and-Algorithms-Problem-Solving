/**
 * leetcode problem on (124)
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
let maxSum ;
function solve(root){
   // Base case
   if(root == null){
       return 0;
   }

   let left = solve(root.left);
   let right = solve(root.right);
   let sumThroughRoot = (left + right + root.val); // 1
   let sumThroughOneChild = Math.max(left , right) + root.val; // 2
   let OnlyRootValue = root.val; // 3

   let maxOne = Math.max(sumThroughRoot , Math.max( OnlyRootValue , sumThroughOneChild));

    maxSum = Math.max(maxSum , maxOne);

   // important part 

   return Math.max(OnlyRootValue , sumThroughOneChild);

}
var maxPathSum = function(root) {
    maxSum = -Infinity;


   solve(root);
   return maxSum;

   
};