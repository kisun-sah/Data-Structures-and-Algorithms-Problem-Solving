/**
 * leetcode problem nu : 199
 * 
 * leetcode link(https://leetcode.com/problems/binary-tree-right-side-view/)
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
    this.val = (val === undefined ? 0 : val);
    this.left = (left === undefined ? null : left);
    this.right = (right === undefined ? null : right);
}

var rightSideView = function(root) {
    let result = [];
    
    if (!root) 
        return result;
    
    let queue = [];
    queue.push(root);
    
    while (queue.length > 0) {
        let n = queue.length;
        let rightNode = null;
        
        for (let i = 0; i < n; i++) {
            rightNode = queue.shift();
            
            if (rightNode.left !== null)
                queue.push(rightNode.left);
            
            if (rightNode.right !== null)
                queue.push(rightNode.right);
        }
        result.push(rightNode.val);
    }
    
    return result;
};

// Example usage
let root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.left.right = new TreeNode(5);
root.right.right = new TreeNode(4);

console.log(rightSideView(root));  // Output: [1, 3, 4]