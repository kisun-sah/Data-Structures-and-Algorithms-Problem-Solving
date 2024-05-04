import java.util.Arrays;

/**
 * leetcode problem no : 62
 * 
 * leetcode solution link(https://leetcode.com/problems/unique-paths/)
 * 
 */
public class UniquePath {
     public static int[][] dp = new int[101][101];
    public static int f(int m ,int n , int i ,int j){
        //Base case 
        if(i <0 || i>=m ) return 0;
        if(j<0 || j>=n) return 0;


        if(i == m-1 && j == n-1)
            dp[i][j]= 1;

            
        if(dp[i][j] != -1)
           return dp[i][j];

            //int right = // f(m,n ,i ,j+1)  col is going to the rigth dir
            
           // int down = f(m,n , i+1 ,j); // row is going to the down dir

            dp[i][j] = f(m,n ,i ,j+1) + f(m,n , i+1 ,j);

            return dp[i][j];
        
    }
    public int uniquePaths(int m, int n) {
        for(int[] x: dp){
            Arrays.fill(x ,-1);
        }
        return f(m,n,0,0);
        
    }
}
