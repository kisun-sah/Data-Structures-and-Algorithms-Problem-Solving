/**
 * 
 * leetcode problem no : (700)
 * 
 * leetcode solution link ()https://leetcode.com/problems/search-in-a-binary-search-tree/
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
 * @param {number} val
 * @return {TreeNode}
 */
function f(root ,val){

    if(root == null) return root;

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
var searchBST = function(root, val) {

    return f(root ,val);
    
};