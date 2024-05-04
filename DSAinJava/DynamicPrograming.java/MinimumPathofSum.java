import java.util.Arrays;

/**
 * leetcode problem no:64
 * 
 * leetcode solution lin(https://leetcode.com/problems/minimum-path-sum/)
 */
class Solution {
    public static int[][] dp =new int[205][205];
    public static int f(int[][] grid , int row , int col ,int m , int n ){

        // Base case 
        if(row == m-1 && col == n-1)
        return grid[row][col];

        if(dp[row][col] != -1) return dp[row][col];

        if(row == m-1) // on goin(g to right direction 
        return dp[row][col]= grid[row][col] + f(grid,row,col+1,m,n);

        if(col == n-1) // on going the Down direction 
        return dp[row ][col]= grid[row][col] + f(grid , row+1 , col ,m,n);

        return dp[row][col]= grid[row][col] + Math.min(f(grid , row,col+1, m,n), f(grid , row+1 , col ,m,n));
 



    }
    public int minPathSum(int[][] grid) {

        int m = grid.length; // row
        int n = grid[0].length ;// col
   
         for(int[] x: dp){

               Arrays.fill(x, -1);
         }
        

        return  f(grid, 0 , 0 ,m , n);
        
    }
}