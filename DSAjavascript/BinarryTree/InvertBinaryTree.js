/**
 * leetcode problem no (226)
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
 * @return {TreeNode}
 */

function f(root){
    if (root == null) return null;

      // please go  and  invert my left subtree
        f(root.left);

        // please got and invert my right subtree
          f(root.right);

          //invert the complete tree

          let temp = root.left;
          root.left = root.right;
          root.right = temp;
}
var invertTree = function(root) {
   f(root);
   return root;
};
