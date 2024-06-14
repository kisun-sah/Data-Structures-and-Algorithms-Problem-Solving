/**
 * leetcode problem no : 230
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
import java.util.ArrayList;
import java.util.List;

class Solution {
    // Helper function to perform in-order traversal
    private void inOrderTraversal(TreeNode node, List<Integer> result) {
        if (node == null) return;
        
        // Traverse the left subtree
        inOrderTraversal(node.left, result);
        
        // Visit the current node
        result.add(node.val);
        
        // Traverse the right subtree
        inOrderTraversal(node.right, result);
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        
        // The k-th smallest element is the k-1 index in the result list
        return result.get(k - 1);
    }
}
