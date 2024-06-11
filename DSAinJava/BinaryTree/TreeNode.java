import java.util.*;

/**
 * leetcode problem no (129)
 * 
 * solution link ()
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
 public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
        this.right = right;
       }
public class Sumrootofleafnum {
  
    int ans;
    private int f(TreeNode root, int num) {
        if (root == null) {
            return 0;
        }
        
        num = num * 10 + root.val;

        // If it's a leaf node, return the current number
        if (root.left == null && root.right == null) {
            return num;
        }

        // Recurse down the left and right children
           int left =  f(root.left, num) ;
           int right =   f(root.right, num);

            ans = (left + right);

           return  ans;
    }
    
    public int sumNumbers(TreeNode root) {
        return f(root, 0);
    }
}
 }

