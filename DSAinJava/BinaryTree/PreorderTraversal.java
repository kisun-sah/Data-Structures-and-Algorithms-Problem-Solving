import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * leetcode problem no : 144
 * 
 * leetcode solution link (https://leetcode.com/problems/binary-tree-preorder-traversal/)
 */
public class PreorderTraversal {
      public List<Integer> preorderTraversal(TreeNode root) {
       List <Integer> result = new LinkedList <> ();
       if(root == null)
       return result;

       Stack <TreeNode> stack = new Stack <> ();
       stack.push (root);

       while(!stack.isEmpty()){
        TreeNode curr = stack.pop();
        result.add(curr.val);

        if(curr.right != null ){
            stack.push(curr.right);


        }
        if(curr.left != null){
            stack.push(curr.left);
        }
       }
       return result;
    }
}
