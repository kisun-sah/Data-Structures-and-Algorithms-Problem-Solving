
/**
 * 
 * Leetcode problem no : 513
 * 
 * Leetcode solution link (https://leetcode.com/problems/find-bottom-left-tree-value/)
 */
public class FindBottomLeftroot {
        int MaxDepth;
       int Bottomleft; // result;
    private int dfs(TreeNode root , int currDepth){
        
        if(root == null){
            return 0; // return null
        }
     //maxdepth 0
        

        //  we check condition if  curr is greater then maxdepth
           if(currDepth > MaxDepth){
            MaxDepth = currDepth;

            Bottomleft = root.val;
    }
           dfs(root.left , currDepth +1); // go to left and increase currDepth +1

           dfs(root.right , currDepth +1) ; // got to right and increase currDepth +1

            return   Bottomleft;


           
    }

    public int findBottomLeftValue(TreeNode root) {

        MaxDepth = -1;
        dfs(root , 0);
        return Bottomleft;
        
    }
    
}
