import java.util.Arrays;

/**
 * leetcode problem no: 72
 * 
 * leetcode solution lin(https://leetcode.com/problems/edit-distance/)
 * 
 */
public class EditDistance {
      public static int[][] dp = new int[501][501];
    public int f(String word1 , String word2  , int i , int j){
        //Base case 
        if(i == word1.length()) return word2.length() -j;

        if(j == word2.length()) return word1.length() -i;

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        //else going to the insert ,delete and replace method 

        //int ans;

        if(word1.charAt(i) == word2.charAt(j)){

            dp[i][j]= f(word1, word2 , i+1, j+1);

        }else{
            

            // Insert 
            int insAns = 1+ f(word1, word2 , i, j+1);

            //Delete
            int delAns = 1+ f(word1 , word2 ,i+1 , j);

            //Replece 
            int repAns = 1+ f(word1 , word2 ,i+1 , j+1);

            dp[i][j]= Math.min(insAns , Math.min(delAns , repAns));
        }
        return dp[i][j];
        
    }
    public int minDistance(String word1, String word2) {

        for(int[] x: dp){
            Arrays.fill(x ,-1);
        }
        
        return f(word1 , word2 ,0,0);
        
    }
    
}
