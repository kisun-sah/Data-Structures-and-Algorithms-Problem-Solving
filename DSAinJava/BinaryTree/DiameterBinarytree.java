/**
 * leetcode problem no : (543)
 * 
 * leetcode solution link ()
 */

    

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class DiameterBinarytree {
    int ans;
    private int f(TreeNode root){
        if(root == null){
            return 0;
        }

        int lst = f(root.left);
        int rst = f(root.right);

        ans = Math.max(ans , lst + rst +1);

        return  1 + Math.max (lst , rst);
    }
    public int diameterOfBinaryTree(TreeNode root) {

        ans = -1;
        f(root);
        return ans -1;
        
    }
}