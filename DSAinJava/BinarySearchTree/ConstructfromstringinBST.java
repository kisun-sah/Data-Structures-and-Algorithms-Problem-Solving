/**
 * 
 * leetcode problem no (606)
 * 
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    
    TreeNode(int val) {
        this.val = val;
    }
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ConstructfromstringinBST {
    
    private String f(TreeNode root) {
        if (root == null) {
            return "";
        }
        
        String left = f(root.left);
        String right = f(root.right);
        
        if (left.isEmpty() && right.isEmpty()) {
            return String.valueOf(root.val);
        } else if (left.isEmpty()) {
            return root.val + "()(" + right + ")";
        } else if (right.isEmpty()) {
            return root.val + "(" + left + ")";
        } else {
            return root.val + "(" + left + ")(" + right + ")";
        }
    }

    public String tree2str(TreeNode root) {
        return f(root);
    }
    
    // Example usage
    public static void main(String[] args) {
        TreeNode rightChild = new TreeNode(3);
        TreeNode leftChild = new TreeNode(2, new TreeNode(4), null);
        TreeNode root = new TreeNode(1, leftChild, rightChild);
        
        ConstructfromstringinBST solution = new ConstructfromstringinBST();
        System.out.println(solution.tree2str(root)); // Output: "1(2(4))(3)"
    }
}


