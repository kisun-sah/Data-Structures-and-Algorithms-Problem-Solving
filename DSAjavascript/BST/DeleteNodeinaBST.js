/**
 * 
 * Leetcode problem no : (450)
 * 
 * Leetcode solution link (https://leetcode.com/problems/delete-node-in-a-bst/)
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
 * @param {number} key
 * @return {TreeNode}
 */

function findmax(root , max){
    while(root != null){

        max = Math.max(max , root.val);

        root = root.right;
    }
    return max;
 }
var deleteNode = function(root, key) {

    if(!root) return null;

    if(root.val > key){

        root.left = deleteNode(root.left , key);
    }else if(root.val < key){

        root.right = deleteNode(root.right , key);

    }else{

        if(root.left != null && root.right!= null){

           let v = findmax(root.left, Number.MIN_SAFE_INTEGER);


            root.val = v;

            root.left = deleteNode(root.left , v)

            return root;

        }else if(root.left != null){

            return root.left;

        }else if(root.right != null){

            return root.right ;

        }else{
             return null;

        }
    }

    return root;
    
};