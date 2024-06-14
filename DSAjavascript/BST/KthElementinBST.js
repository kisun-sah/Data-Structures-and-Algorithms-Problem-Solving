/**
 * leetcode problem no : 230
 * 
 * leetcode solution link ()
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
 * @param {number} k
 * @return {number}
 */

  // Helper function to perform in-order traversal
  function inOrderTraversal(node, result) {
    if (node === null) return;
    
    // Traverse the left subtree
    inOrderTraversal(node.left, result);
    
    // Visit the current node
    result.push(node.val);
    
    // Traverse the right subtree
    inOrderTraversal(node.right, result);

       

};


var kthSmallest = function(root, k) {


   const result = [];

inOrderTraversal(root, result);
  // The k-th smallest element is the k-1 index in the result array
return result[k - 1];

};
