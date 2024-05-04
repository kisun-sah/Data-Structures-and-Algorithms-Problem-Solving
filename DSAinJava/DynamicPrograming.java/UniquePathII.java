import java.util.Arrays;
/**
 * leetcode problem no:63
 * 
 * leetcode solution link(https://leetcode.com/problems/unique-paths-ii/)
 */
public class UniquePathII {
      public static int[ ] [] dp = new int [101][101];
    public static int f(int[][] obstacleGrid, int m, int n ,int i ,int j){
        //Basic case
        if(i<0||i>=m) return 0;
        if(j<0 || j>= n) return 0;
        if(obstacleGrid[i][j] == 1) return 0;
        
        if(i == m-1 && j == n-1){
            dp[i][j]= 1;
        }
     

           if(dp[i][j] != -1) return dp[i][j];
        //else
        int right = f(obstacleGrid ,m,n,i,j+1); //col going to rigth dir
        int down = f(obstacleGrid , m ,n ,i+1 , j); // row is going to down dir

        dp[i][j]= (right + down);

        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length ;// row
        int n =obstacleGrid[0].length; //col

        for(int[] x :dp){
            Arrays.fill(x ,-1);
        }

        return f(obstacleGrid ,m,n,0,0);
        
    }
    
}
