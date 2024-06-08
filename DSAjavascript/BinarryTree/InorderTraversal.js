/**
 * leetcode problem no :(142)
 * 
 * leetcode solution link (https://leetcode.com/problems/binary-tree-inorder-traversal/)
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
 * @return {number[]}
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
 * @return {number[]}
 */

function TreeNode(val, left, right) {
       this.val = (val===undefined ? 0 : val)
       this.left = (left===undefined ? null : left)
       this.right = (right===undefined ? null : right)
    }
var inorderTraversal = function(root) {
    let result = [];
    let curr = root;
    let pre;

    while (curr !== null) {
        if (curr.left === null) {
            result.push(curr.val);
            curr = curr.right;
        } else {
            pre = curr.left;

            while (pre.right !== null && pre.right !== curr) {
                pre = pre.right;
            }

            if (pre.right === null) {
                pre.right = curr;
                curr = curr.left;
            } else {
                pre.right = null;
                result.push(curr.val);
                curr = curr.right;
            }
        }
    }

    return result;
};

// Example usage:
// Input: root = [1,null,2,3]
// Construct the binary tree from the example:
let root = new TreeNode(1);
root.right = new TreeNode(2);
root.right.left = new TreeNode(3);

let result = inorderTraversal(root);
console.log(result); // Output: [1, 3, 2]
