/**
 * leetcode problem no : 145
 * 
 * leetocd solution link (https://leetcode.com/problems/binary-tree-postorder-traversal/)
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
// Definition for a binary tree node.
class TreeNode {
    constructor(val, left = null, right = null) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

var postorderTraversal = function(root) {

    let result = [];
    if(root == null){
        return result;
    }

    let stack =[];
    stack.push(root);

    while(stack.length >0){
        let curr = stack.pop();
        result.push(curr.val);

        if(curr.left != null){
            stack.push(curr.left);

        }
        if(curr.right != null){
            stack.push(curr.right);
        }

    }
    
     result.reverse();
    return result;
    
};
// Example usage:
const root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3)));
const solution = new  postorderTraversal();
console.log(postorderTraversal(root)); // Output: [3, 2, 1]