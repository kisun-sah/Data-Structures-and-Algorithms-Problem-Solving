/**
 * leetcode problem no :(110)
 * 
 * leetcode  solution link ()
 */
public class BalancedBinaryTree {
      // Helper class to store the height and balance status together
      private static class TreeInfo {
        public final int height;
        public final boolean isBalanced;
        
        public TreeInfo(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    private TreeInfo checkBalanced(TreeNode node) {
        // Base case: an empty subtree is balanced and its height is -1
        if (node == null) {
            return new TreeInfo(-1, true);
        }

        // Recursively check the left subtree
        TreeInfo left = checkBalanced(node.left);
        // If the left subtree is not balanced, no need to check further
        if (!left.isBalanced) {
            return new TreeInfo(-1, false);
        }

        // Recursively check the right subtree
        TreeInfo right = checkBalanced(node.right);
        // If the right subtree is not balanced, no need to check further
        if (!right.isBalanced) {
            return new TreeInfo(-1, false);
        }

        // Check if the current node is balanced
        boolean isBalanced = Math.abs(left.height - right.height) <= 1;
        // The height of the current node
        int height = Math.max(left.height, right.height) + 1;

        return new TreeInfo(height, isBalanced);
    }

    public boolean isBalanced(TreeNode root) {
        return checkBalanced(root).isBalanced;
    }
}
